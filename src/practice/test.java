package practice;

import java.io.*;

public class test implements Runnable{
	int q;
	public test(int i) {
		this.q=i;
	}
	
		public static void main(String[] args) {
			System.out.println("Hello World");
	        String s="null";
	        System.out.println(s);
	        if(s.equals("null"))
	            System.out.println("hi");
			
	        int p=10;
		 
	        for (int i = 0; i < 10; ) {
				Runnable r= new test( i);
				Runnable r1= new test( i+1);
				new Thread(r).run();
				new Thread(r1).run();
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("in thread--"+q);
		}
		}


