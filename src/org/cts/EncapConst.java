package org.cts;

import java.util.HashMap;
import java.util.Map;

public class EncapConst {

	private String empName;

	private float empSalary;

	public EncapConst(String empName, float empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EncapConst [empName=" + empName + ", empSalary=" + empSalary + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Map<Integer, EncapConst> m1 = new HashMap<>();

	}

}
