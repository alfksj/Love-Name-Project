import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class IO {
	/*static {
		System.loadLibrary("io");
	}*/
	private static String trans = "AES/CBC/PKCS5Padding";
	private static IvParameterSpec iv = new IvParameterSpec("fje9Sfjfj03gjsS8".getBytes());
	private static SecretKeyFactory SKF;
	private static PBEKeySpec PKS;
	private static SecretKey SK;
	private static SecretKeySpec SKS;
	public static void Fileout(String path, String str, String key) throws Exception {
		byte[] b64=str.getBytes();
		byte block[] = new byte[1024];
		OutputStream o = new BufferedOutputStream(new FileOutputStream(new File(path)));
		SecureRandom SR = new SecureRandom();
		byte[] salt=new byte[20];SR.nextBytes(salt);
		SKF=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		PKS=new PBEKeySpec(key.toCharArray(),salt,7000,256);
		SK=SKF.generateSecret(PKS);
		SKS=new SecretKeySpec(SK.getEncoded(),"AES");
		for(int i=0;i<b64.length; i++) {
			block[i%1024]=b64[i];
			if(i==1023) {
				block=crypt(block,Cipher.ENCRYPT_MODE,key,1024);
				o.write(block);
			} else if(i==b64.length-1) {
				block=crypt(block,Cipher.ENCRYPT_MODE,key,b64.length%1024);
				o.write(block);
			}
		}
		o.close();
	}
	public static String Filein(String path, String key) throws Exception {
		InputStream i = new BufferedInputStream(new FileInputStream(new File(path)));
		byte buffer[] = new byte[1024];
		SecureRandom SR = new SecureRandom();
		byte[] salt=new byte[20];SR.nextBytes(salt);
		SKF=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		PKS=new PBEKeySpec(key.toCharArray(),salt,7000,256);
		SK=SKF.generateSecret(PKS);
		SKS=new SecretKeySpec(SK.getEncoded(),"AES");
		int rd=-1;
		StringBuffer rt=new StringBuffer();
		while((rd=i.read(buffer))!=-1) {
			buffer=crypt(buffer,Cipher.DECRYPT_MODE,key,rd);
			rt.append(new String(buffer));
		}
		i.close();
		buffer=null;
		return rt.toString();
	}
	private static byte[] crypt(byte[] data, int mode, String key, int len) throws Exception {
		Cipher cipher = Cipher.getInstance(trans);
		cipher.init(mode, SKS ,iv);
		cipher.update(data,0,len);
		return cipher.doFinal();
	}
	public static String in(String path) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
		int buf;StringBuffer snwjr=new StringBuffer();
		while((buf=in.read())!=-1) {
			snwjr.append((char)buf);
		}
		in.close();
		return snwjr.toString();
	}
	public static void out(String path, String data) throws Exception{
		BufferedWriter in = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"UTF-8"));
		in.write(data);
		in.close();
	}
	/*public static void JNIOut(String path, String data) {
		JNIOUT(path,data);
	}
	public static String JNIIn(String path) {
		return JNIIN(path);
	}
	private static native String JNIIN(String path);
	private static native void JNIOUT(String path, String data);*/
}
