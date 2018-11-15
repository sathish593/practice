package practice;

import java.io.*;

public class CopyOftest {
	
	public int pairs(String[] input1, int input2)
	{
		int counter=0;
		for(int i=0;i<input1.length;i++)
		{
			if(input1[i].length()<3 && input1[i].length()>4)
			{
				System.out.println("in if");
				return -1;
			}
			int p = Character.getNumericValue(input1[i].charAt(0));
			int q=Integer.parseInt(input1[i].substring(2));
			
			double factq= (q<10)? 0.1:0.01;
			if(4<=p&&p<=7&&q<=11&&q>=0&&(input1[i].charAt(1)=='#'))
			{
			//System.out.println("success"+p+"    "+q );
				for(int j=i+1;j<input1.length;j++)
				{
					int pj = Character.getNumericValue(input1[j].charAt(0));
					int qj=Integer.parseInt(input1[j].substring(2));
					double facetqj= (qj<10)? 0.1:0.01;
					if((p+(factq*q))>(pj+(facetqj*qj)))
					{
						counter=counter+1;
					}
				}
				System.out.println("counter for "+i +"is"+counter);	
			}
			else
			{	
				System.out.println("in else");
				return -1;
			}
			
		}
		return counter;
	
	}
	
		/*public static void main(String[] args) {
		
			String[] input1={"4#11","6#0","5#2","6#1","7#1","5#11","5#11","5#10","5#8"};
			int input2=10;
			CopyOftest t = new CopyOftest();
		 System.out.println( t.pairs(input1, input2));
			
		}*/
		}


