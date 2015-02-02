package package1;  
  
import java.io.IOException;  
import java.io.PrintWriter;  

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
import package1.LoginDao;  
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class LoginServlet extends HttpServlet{  
  
    private static final long serialVersionUID = 1L;  
  
   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
  
        response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n=request.getParameter("username");    
        String p=request.getParameter("password");   
               
        try {
            if(LoginDao.validate(n, p)){
                HttpSession session = request.getSession();
                session.setAttribute("username",n);
                
                out.print("<p style=\"color:green\">Login Successful!</p>");
                RequestDispatcher rd=request.getRequestDispatcher("index2.jsp");
                rd.include(request,response);
                
                
            }
            else{
                out.print("<p style=\"color:red\">Sorry username or password are not valid!</p>");
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                rd.include(request,response);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        out.close();    
    }    
}   