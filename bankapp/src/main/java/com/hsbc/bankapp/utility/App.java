package com.hsbc.bankapp.utility;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//create scanner object to read data
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		//display message to enter id
        System.out.println("Enter Account No");
        //variables
         long accountNo=scanner.nextLong();
         System.out.println("\n");       
         System.out.println("The given AccountNo="+accountNo);
        
        System.out.println("Enter Customer DOB");
        
        System.out.println("Enter day");
        byte day=scanner.nextByte();
        System.out.println("\n");     
        
        System.out.println("Enter month");
        byte month=scanner.nextByte();
        System.out.println("\n");  
        
        System.out.println("Enter year");
        short year=scanner.nextByte();
        System.out.println("\n");  
        
        
     
        
	}

}
