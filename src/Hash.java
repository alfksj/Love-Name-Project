import java.io.File;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Hash {
	public static int SHA128=0;
	public static int SHA224=1;
	public static int SHA256=2;
	public static int SHA384=3;
	public static int SHA512=4;
	public static int MD5=5;
	public String hash(String plainText, int type) {
		String toReturn = null;
		try {
			MessageDigest digest=null;
			switch(type) {
			case 0:
				digest = MessageDigest.getInstance("SHA-128");
				break;
			case 1:
				digest = MessageDigest.getInstance("SHA-224");
				break;
			case 2:
				digest = MessageDigest.getInstance("SHA-256");
				break;
			case 3:
				digest = MessageDigest.getInstance("SHA-384");
				break;
			case 4:
				digest = MessageDigest.getInstance("SHA-512");
				break;
			case 5:
				digest = MessageDigest.getInstance("MD5");
				break;
			}
			digest.reset();
			digest.update(plainText.getBytes("UTF8"));
			toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return toReturn;
	}
	@SuppressWarnings("unused")
	private static String fHash(File path, int algorithm) throws Exception {
		 String SHA = ""; 
		 int buff = 16384;
		 RandomAccessFile file = new RandomAccessFile(path, "r");
	     MessageDigest digest = null;
	     switch(algorithm) {
			case 0:
				digest = MessageDigest.getInstance("SHA-128");
				break;
			case 1:
				digest = MessageDigest.getInstance("SHA-224");
				break;
			case 2:
				digest = MessageDigest.getInstance("SHA-256");
				break;
			case 3:
				digest = MessageDigest.getInstance("SHA-384");
				break;
			case 4:
				digest = MessageDigest.getInstance("SHA-512");
				break;
			case 5:
				digest = MessageDigest.getInstance("MD5");
				break;
			}
	     byte[] buffer = new byte[buff];
	     byte[] partialHash = null;
	     long read = 0;
	     long offset = file.length();
	     int unitsize;
	     while (read < offset) {
	     	unitsize = (int) (((offset - read) >= buff) ? buff : (offset - read));
	        file.read(buffer, 0, unitsize);
	        digest.update(buffer, 0, unitsize);read += unitsize;
	     }
	     file.close();
	     partialHash = new byte[digest.getDigestLength()];
	     partialHash = digest.digest();
	     StringBuffer sb = new StringBuffer(); 
	     for(int i = 0 ; i < partialHash.length ; i++){
	    	 sb.append(Integer.toString((partialHash[i]&0xff) + 0x100, 16).substring(1));
	     }
	     SHA = sb.toString();
	     return SHA;
	}
}
