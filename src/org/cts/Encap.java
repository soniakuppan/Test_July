package org.cts;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encap {
	private int empId;
	private String empName;
	private double empSalary;

	public void setEmpid(int empid) {
		this.empId = empid;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter empId");
		int eId=scan.nextInt();
		
		Encap en = new Encap();
		en.setEmpid(123);
		en.setEmpName("Sonia");
		en.setEmpSalary(2345677);
		List<Encap> l1=new ArrayList<>();
		l1.add(en);
		
		
		
		for(Encap temp:l1)
		{
		if(temp.equals(eId))
		{
			System.out.println(temp);}
		
			
			else
			{
				System.out.println("No employee");
				
			}
		}
			
		
		}
}
		
		
		
		
		
		
		

//		Encap en = new Encap();
//		en.setEmpid(123);
//		en.setEmpName("Sonia");
//		en.setEmpSalary(2345677);
//		System.out.println(en.empId);
//		System.out.println(en.empName);
//		System.out.println(en.empSalary);
	


