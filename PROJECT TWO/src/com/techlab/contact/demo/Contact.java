package com.techlab.contact.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Contact {
       public void display() {
    	   try{  
    		   Class.forName("com.mysql.jdbc.Driver");  
    		   Connection con=DriverManager.getConnection(  
    		   "jdbc:mysql://localhost:3306/server","root","password");  
    		   Statement stmt=con.createStatement();  
    		   ResultSet rs=stmt.executeQuery("select * from contact");  
    		   while(rs.next())  
    		   System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));  
    		   con.close();  
    		   }
    		   catch(Exception e){
    			   System.out.println(e);
    		   } 
       }
       public void add() throws SQLException {
    	   java.sql.Connection conn = null;
   		java.sql.Statement stmt = null;
   		ResultSet res = null;
   		try{  
   			
   			Class.forName("com.mysql.jdbc.Driver");
   			
   			 conn=DriverManager.getConnection(  
   			"jdbc:mysql://localhost:3306/server","root","password");  
   			System.out.println("sucessfull conection:");
   			
   			 stmt=conn.createStatement();
   			
   			int rows =stmt.executeUpdate("INSERT INTO contact(fname,lname,number,emailid)\r\n" + "values('rocky',\"raj\",\"4587\",\"email\");");
   					 
   					 res =stmt.executeQuery("SELECT * FROM contact");
   			 
   			
   			while(res.next())  
   			System.out.println(res.getString("FNAME")+"  "+res.getString("LNAME")+"  "+res.getInt("NUMBER")+" "+res.getString("EMAILID"));  
   			conn.close();  
   			}
   			catch(Exception e){ 
   				System.out.println("unsucessfull");
   				e.printStackTrace();
   				}  
   		finally {
   			if(res!=null) {
   				res.close();
   			}
   		}
   }  
       public void delete() 
    	   throws SQLException {
        	   java.sql.Connection conn = null;
       		java.sql.Statement stmt = null;
       		ResultSet res = null;
       		try{  
       			
       			Class.forName("com.mysql.jdbc.Driver");
       			
       			 conn=DriverManager.getConnection(  
       			"jdbc:mysql://localhost:3306/server","root","password");  
       			System.out.println("sucessfull conection:");
       			stmt=conn.createStatement();
       			int rows=stmt.executeUpdate("DELETE FROM contact WHERE NUMBER=4567" );
       			res =stmt.executeQuery("SELECT * FROM contact");
       			
       			
       			
       			while(res.next())  
       			System.out.println(res.getString("FNAME")+"  "+res.getString("LNAME")+"  "+res.getInt("NUMBER")+" "+res.getString("EMAILID"));  
       				conn.close();
       			}
       			catch(Exception e){ 
       				System.out.println("unsucessfull");
       				e.printStackTrace();
       				
       				}  
       		
       		
       		finally {
       			if(res!=null) {
       				res.close();
       			}
       		}
       		
       }
   	
        public void update() {
        	
        }
}
