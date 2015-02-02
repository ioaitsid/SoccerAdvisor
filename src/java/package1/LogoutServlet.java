/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Yannis
 */
public class LogoutServlet extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              HttpSession session = request.getSession();
              session.setAttribute("username", null);
               session.invalidate();
              out.print("<p style=\"color:red\">Log Out Successful!</p>");
              RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
              rd.include(request,response);
              out.close();
               
               
        
    }
    
}


   