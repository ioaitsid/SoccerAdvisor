package package1;  
  
    import java.io.*; 
    import java.sql.*;
    import javax.servlet.ServletException;
    import javax.servlet.http.*;
    import javax.servlet.RequestDispatcher;
    import javax.servlet.http.HttpSession;
    


public class RemoveServlet extends HttpServlet{
        @Override

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

               response.setContentType("text/html");
               PrintWriter pw = response.getWriter();
               Connection con;
               PreparedStatement st;
               ResultSet rs;
               String n=request.getParameter("name"); 
               
               HttpSession session = request.getSession();
               String user = (String) session.getAttribute("username");  
  
      
                String url = "jdbc:mysql://localhost:3306/";  
                String dbName = "test";  
                String driver = "com.mysql.jdbc.Driver";  
                String userName = "root";  
                String password = "1234";    
               
               
               try{

                    Class.forName(driver);
                    con = DriverManager.getConnection(url + dbName, userName, password);
                    st= con.prepareStatement("delete from players where name=? and username=?");
                    st.setString(1,n);
                    st.setString(2,user);
                    int i = st.executeUpdate();
                    if(i!=0){
                        pw.println("<br><p style=\"color:lightgreen\">Player has been successfully removed.</p>");
                        RequestDispatcher rd=request.getRequestDispatcher("remove.jsp");
                        rd.include(request,response);
                    }
                    else if (i==0){

                        pw.println("<br><p style=\"color:red\">Sorry player not found.</p>");
                        RequestDispatcher rd=request.getRequestDispatcher("remove.jsp");
                        rd.include(request,response);
                    }
                }
                catch(SQLException sx){
        
                        pw.println(sx);
                }
                catch(ClassNotFoundException cx){
                        pw.println(cx);
                } 
        }
}

