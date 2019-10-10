
public class Except {
	public static String except(Exception e) {
		StackTraceElement[] s=e.getStackTrace();
		StringBuffer log = new StringBuffer("Exception "+e.getMessage()+'\n');
		for(StackTraceElement q : s) {
			log.append("     at "+q.getFileName()+"."+q.getClassName()+"."+q.getMethodName()+" Line ("+q.getLineNumber()+")\n");
		}
		return log.toString();
	}
}
