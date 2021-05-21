package com.veer.login;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/logout"})
public class logout extends HttpServlet {

 
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           
   {
       try{
           
           
           HttpSession session = request.getSession();
           session.removeAttribute("email");
           session.removeAttribute("password");
           session.invalidate();
           response.sendRedirect("index.html");
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }

    
}
