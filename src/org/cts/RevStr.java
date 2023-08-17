package org.cts;

public class RevStr {
public static void main(String[] args) {
String str1="hello team where are you";
String rev=" ";

for(int i=str1.length()-1;i>=0;i--)
{
	char ch=str1.charAt(i);
	rev=rev+ch;
	
}
System.out.println(rev);

}
}
