package org.cts;

public class ArrayPgm {
	public static void main(String[] args) {
	int sum=0;
	double  avg=0;
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
		avg=sum/arr.length;
		
	}
	System.out.println(sum);
	System.out.println(avg);

	}
}
