package com.veer.insert;

import static java.lang.Math.random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class insert_verify {
 
     private static String url2 = "jdbc:mysql://localhost:3306/test";
     private static String username = "root";
     private static String password = "prabeer";
     private static PreparedStatement stmt = null;
     private static int count = 0;
     private static String email = null;
     private static Connection conn = null;
     int min = 1000;
     int max = 9999;
  
     
     public boolean check_verify(String f_name, String l_name, String mobile, String age, String dept, String desig)
     
     {
         
         try{
             
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(url2, username, password);
             
             String email_combine = f_name +"."+ l_name;
             
             Statement check_mail = conn.createStatement();
             String sql = "select * from userform where email = '"+email_combine+"@veer-tech.com'";
            
             ResultSet rs = check_mail.executeQuery(sql);
             
             Random rand = new Random();
             
             int emp_id = rand.nextInt(max-min)+min;
             
              if(rs.next())
            {
                String sql2 = "select count(email) from userform where first_name = '"+f_name+"' and last_name = '"+l_name+"'";
                ResultSet rs2 = check_mail.executeQuery(sql2);
                
                 rs2.next();
                
                 int email_count = rs2.getInt(1);
                 count = count + email_count;
                 
                System.out.println("New Email : "+email_combine+count+"@veer-tech.com");
                
                email = email_combine+count+"@veer-tech.com";
                
            }
            else{
                System.out.println("New Email : "+email_combine+"@veer-tech.com");
                email = email_combine+"@veer-tech.com";
            }
             
              add_to_db(f_name, l_name, email, mobile, age, dept, desig, emp_id);
         }
          catch(Exception e)
        {
            e.printStackTrace();
        }
         
         return false;
         
     }
     
     private static void add_to_db(String f_name, String l_name, String email, String mobile, String age, String dept, String desig, int emp_id)
    {
        try{
          
       
            
         stmt = conn.prepareStatement("insert into userform(first_name, last_name, email, mobile_no, age, dept, deg, emp_id) values(?,?,?,?,?,?,?,?)");
         stmt.setString(1, f_name);
         stmt.setString(2, l_name);
         stmt.setString(3, email);
         stmt.setString(4, mobile);
         stmt.setString(5, age);
         stmt.setString(6, dept);
         stmt.setString(7, desig);
         stmt.setInt(8, emp_id);
         
         int rs = stmt.executeUpdate();

         System.out.println("----------------------------------");
         System.out.println("New Entry added to database");
         
         
         stmt.close();
         conn.close();
        
        }
        
        catch(Exception e)
        {

            e.printStackTrace();
        }
        
    }
     
}
