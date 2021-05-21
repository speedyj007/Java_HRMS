
package com.veer.insert;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;


@WebServlet(name = "insert_details", urlPatterns = {"/insert_details"})

public class insert_get_details extends HttpServlet {

   
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String f_name = request.getParameter("fname");
        String l_name = request.getParameter("lname");
        String mobile = request.getParameter("mobile");
        String age = request.getParameter("age");
        String dept = request.getParameter("dept");
        String desig = request.getParameter("desig");
        
        insert_verify cv = new insert_verify();
        
        if(cv.check_verify(f_name, l_name, mobile, age, dept, desig))
        {
            HttpSession session = request.getSession();
            
            session.setAttribute("f_name", f_name);
            session.setAttribute("l_name", l_name);
            session.setAttribute("mobile", mobile);
            session.setAttribute("age", age);
            session.setAttribute("dept", dept);
            session.setAttribute("desig", desig);
            
            System.out.println("Entry has been added to db !!!");
            response.sendRedirect("welcome.jsp");
            
        }
        else{
            System.out.println("Error in entring user. Please see the logs !!!");
            System.out.println("<script type=\"text/javascript\">");
            System.out.println("alert(Error in entring user. Please see the logs)");
            System.out.println("</script");
            
            response.sendRedirect("insert_record.jsp");
        }
        
        
    }


}
