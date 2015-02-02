package package1;

    import java.io.*;  
    import java.sql.*;  
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;  
    import javax.servlet.http.*;  
      
    public class RegServlet extends HttpServlet {  
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
              
    String n=request.getParameter("username");  
    String e=request.getParameter("email");  
    String p=request.getParameter("password");  
     
        
    
    
     Connection conn = null; 
     PreparedStatement pst = null;  
      
     String url = "jdbc:mysql://localhost:3306/";  
     String dbName = "test";  
     String driver = "com.mysql.jdbc.Driver";  
     String userName = "root";  
     String password = "1234";    
     
     
    
     
     
    try{  
            Class.forName(driver).newInstance();  
            conn = DriverManager  
                    .getConnection(url + dbName, userName, password);  
            pst = conn  
                    .prepareStatement("insert into userdata values(?,?,?)"); 
      
    pst.setString(1,n);  
    pst.setString(2,p);  
    pst.setString(3,e);  
    
     
              
    int i=pst.executeUpdate();  
    if(i>0)  
    out.print("You are successfully registered...");  
    RequestDispatcher rd=request.getRequestDispatcher("index2.jsp");
           rd.forward(request,response);
            
              
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
      
    }  