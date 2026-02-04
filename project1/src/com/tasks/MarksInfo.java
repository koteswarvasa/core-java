package com.tasks;

public class MarksInfo {
	String name;
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	
	int total_marks;
	float averageMarks;
	
	
	 void show() {
		total_marks=sub1+sub2+sub3+sub4+sub5;
		averageMarks=total_marks/5;
		System.out.println("======= student Details =======");
		System.out.println("Name:"+name);
		System.out.println("Total marks:"+total_marks);
		System.out.printf("Average marks:"+"%.2f",averageMarks);
		System.out.println();
		
	}
	
	void main() {
		MarksInfo t1=new MarksInfo();
		t1.name="Lucky";
		t1.sub1=100;
		t1.sub2=100;
		t1.sub3=100;
		t1.sub4=100;
		t1.sub5=100;
		
		t1.show();
		
		MarksInfo t2=new MarksInfo();
		t2.name="Lucky";
		t2.sub1=78;
		t2.sub2=49;
		t2.sub3=40;
		t2.sub4=80;
		t2.sub5=60;
		
		t2.show();
		
	}
}
