package com.perscholas;

import java.util.Scanner;

public class FirstJavaProgram
{

	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		  System.out.println("enter your name : ");
		  String str1= input.next();
		  input.close();
		  System.out.println(" Hello! " +str1+ ", Welcome to Java ");
	}

}
