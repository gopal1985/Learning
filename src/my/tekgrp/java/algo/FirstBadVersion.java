package my.tekgrp.java.algo;

public class FirstBadVersion {

	public static void main(String[] args) {

		int n = 9;
		int start = 1;
	        
        while (start <= n){
        	
            int badVer = start + (n-start)/2;
            
            if(isBadVersion(badVer)){
            	n = badVer -1;
            } else {
            	start = badVer + 1;
            }
        }
        System.out.println("Bad Version :: " + start);        
    }
	
	public int firstBadVersion(int n) {

        int start = 1;    
        while (start <= n){
            int badVer = start + (n-start)/2;
            if(isBadVersion(badVer)){
            	n = badVer -1;
            } else {
            	start = badVer + 1;
            }
        }
        return start;
    }
	
	
	static boolean isBadVersion(int ver) {
		if(ver >= 4) {
			return true;
		}else {
			return false;
		}
		
	}
}
