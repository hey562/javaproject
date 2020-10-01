package com.techlab.contact.demo;

import java.sql.SQLException;
import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       Scanner s  =new Scanner(System.in);
       Contact c=new Contact();
       String a;
        while(true) {
        	System.out.println("ENTER A VALID CHOICE:");
        	a=s.nextLine();
        	switch(a) {
        	case "1":
        		c.display();
        		break;
        	case "2":
        		c.add();
        		break;
        		
        	case "3":
        		c.delete();
        		break;
        	default :
        		System.out.println("INVALID CHOICE:");
        	}
        }
	}

}
