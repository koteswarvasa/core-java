package com.tasks;

public class Box_Pattern {
public static void main(String[] args) throws InterruptedException {
	
	char ch ='a';
	String s = "KOHLI";
	
	
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==j || i+j==6) {
				Thread.sleep(1000);
				System.err.print(s.charAt(i-1)+" ");
			}else {
				Thread.sleep(1000);
				System.out.print((char) ch++ +" ");
			}
		}
		System.out.println();
	}
	
      
	
}
}
