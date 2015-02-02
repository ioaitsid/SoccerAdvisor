package package1;
    
    import java.io.*;  
    import java.sql.*;  
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;  
    import javax.servlet.http.*;  
    import javax.servlet.http.HttpSession;

    public class AddServlet extends HttpServlet {  
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    
    HttpSession session = request.getSession();
    String user = (String) session.getAttribute("username");
    
    String name=request.getParameter("name"); 
    
    String head=request.getParameter("heading");
    String pass=request.getParameter("passing");  
    String cros=request.getParameter("crossing"); 
    String shoo=request.getParameter("shooting"); 
    String defe=request.getParameter("defending"); 
    String tech=request.getParameter("technique"); 
    String goal=request.getParameter("goalkeeping"); 
    String anti=request.getParameter("anticipation"); 
    String brav=request.getParameter("bravery"); 
    String crea=request.getParameter("creativity"); 
    String offt=request.getParameter("offtheball"); 
    String posi=request.getParameter("positioning"); 
    String work=request.getParameter("workrate"); 
    String comp=request.getParameter("composure"); 
    String team=request.getParameter("teamwork"); 
    String stam=request.getParameter("stamina"); 
    String spee=request.getParameter("speed"); 
    String weig=request.getParameter("weight"); 
    String heig=request.getParameter("height"); 
  
    double heading = Double.parseDouble(head);
    double passing = Double.parseDouble(pass);
    double crossing = Double.parseDouble(cros);
    double shooting = Double.parseDouble(shoo);
    double defending = Double.parseDouble(defe);
    double technique = Double.parseDouble(tech); 
    double goalkeeping = Double.parseDouble(goal);
    double anticipation = Double.parseDouble(anti);
    double bravery = Double.parseDouble(brav);
    double creativity = Double.parseDouble(crea);
    double offtheball = Double.parseDouble(offt);
    double positioning = Double.parseDouble(posi);
    double workrate = Double.parseDouble(work);
    double composure = Double.parseDouble(comp);
    double teamwork = Double.parseDouble(team);
    double stamina = Double.parseDouble(stam);
    double speed = Double.parseDouble(spee);
    double weight = Double.parseDouble(weig); 
    double height = Double.parseDouble(heig);   
    
    
    
     
    
    double upsos = 1.0, varos =1.0;
    
    if(height<=155){upsos=1;}
    else if(height<=155){upsos=1;}
    else if (height<=160){upsos=2;}
    else if (height<=165){upsos=3;}
    else if (height<=170){upsos=4;}
    else if (height<=175){upsos=5;}
    else if (height<=180){upsos=6;}
    else if (height<=185){upsos=7;}
    else if (height<=190){upsos=8;}
    else if (height<=195){upsos=9;}
    else if (height<=220){upsos=10;} 
   
    if(weight<=60){varos=1;}
    else if (weight<=65){varos=2;}
    else if (weight<=70){varos=3;}
    else if (weight<=75){varos=4;}
    else if (weight<=80){varos=5;}
    else if (weight<=85){varos=6;}
    else if (weight<=90){varos=7;}
    else if (weight<=95){varos=8;}
    else if (weight<=100){varos=9;}
    else if (weight<120){varos=10;}  
    
    double gk=0.6*goalkeeping+0.3*upsos+0.1*anticipation;
    double dc=0.5*defending+0.25*positioning+0.1*upsos+0.1*heading+0.05*anticipation;
    double sb=0.35*defending+0.225*positioning+0.125*crossing+0.2*speed+0.05*heading+0.05*stamina;
    double dm=0.3*defending+0.15*passing+0.15*stamina+0.05*bravery+0.1*workrate+0.125*positioning+0.075*teamwork+0.05*heading;
    double mc=0.15*stamina+0.1*defending+0.2*passing+0.05*bravery+0.1*creativity+0.1*teamwork+0.1*workrate+0.05*technique+0.1*anticipation+0.05*positioning;
    double amc=0.1*shooting+0.225*passing+0.1*technique+0.225*creativity+0.1*offtheball+0.05*composure+0.1*teamwork+0.1*speed;
    double ams=0.1*passing+0.2*crossing+0.1*shooting+0.15*technique+0.05*creativity+0.1*offtheball+0.3*speed;
    double st=0.05*heading+0.3*shooting+0.05*technique+0.05*anticipation+0.05*bravery+0.2*offtheball+0.15*composure+0.05*varos+0.1*speed ;
    
    
    
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
                   .prepareStatement("insert into players values(?,?,?,?,?,?,?,?,?,?)"); 
            
            pst.setString(1,user);
            pst.setString(2,name);  
        
            pst.setDouble(3,gk);  
            pst.setDouble(4,dc);  
            pst.setDouble(5,sb);  
            pst.setDouble(6,dm);  
            pst.setDouble(7,mc);   
            pst.setDouble(8,amc);    
            pst.setDouble(9,ams);
            pst.setDouble(10,st);   
             
   
    int i=pst.executeUpdate();  
    if(i>0)  
    out.print("<p style=\"color:lightgreen\">Player Successfully Added!!</p>");
    RequestDispatcher rd=request.getRequestDispatcher("add.jsp");
           rd.include(request,response);
           
              
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
      
    }  