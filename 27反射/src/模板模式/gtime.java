package Ä£°åÄ£Ê½;

public abstract class gtime{
	public abstract void codes() ;
	public long gettime() {
	
	long start=System.currentTimeMillis();
	 codes();
	long end=System.currentTimeMillis();
	return (end-start);
	}


}