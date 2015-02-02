package package1;
    
    import java.io.*;  
    import java.sql.*;  
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;  
    import javax.servlet.http.*;  
    import javax.servlet.http.HttpSession;

    public class CalcServlet extends HttpServlet {  
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
      
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    
    HttpSession session = request.getSession();
    String user = (String) session.getAttribute("username");  
    
    String name=request.getParameter("name"); 
    String forma=request.getParameter("formation"); 
     
    
     Connection conn = null; 
     PreparedStatement pstgk = null;  
     PreparedStatement pst1gk = null;  
     PreparedStatement pstdc = null;  
     PreparedStatement pst1dc = null;  
     PreparedStatement pstsb = null;  
     PreparedStatement pst1sb = null;  
     PreparedStatement pstdm = null;  
     PreparedStatement pst1dm = null;  
     PreparedStatement pstmc = null;  
     PreparedStatement pst1mc = null; 
     PreparedStatement pstamc = null;  
     PreparedStatement pst1amc = null;
     PreparedStatement pstams = null;  
     PreparedStatement pst1ams = null;
     PreparedStatement pstst = null;  
     PreparedStatement pst1st = null;  
     
     PreparedStatement pstdc2 = null;  
     PreparedStatement pst1dc2 = null;
     PreparedStatement pstdc3 = null;
     PreparedStatement pst1dc3 = null;  
     PreparedStatement pstmc2 = null;
     PreparedStatement pst1mc2 = null;
     PreparedStatement pstsb2 = null;
     PreparedStatement pst1sb2 = null;
     PreparedStatement pstams2 = null;
     PreparedStatement pst1ams2 = null;
     PreparedStatement pstst2 = null;
     PreparedStatement pst1st2 = null;  
     
     PreparedStatement pstomada = null;
     PreparedStatement pstdel = null;
     
     String url = "jdbc:mysql://localhost:3306/";  
     String dbName = "test";  
     String driver = "com.mysql.jdbc.Driver";  
     String userName = "root";  
     String password = "1234";    
     
  

     
    try{  
            Class.forName(driver).newInstance();  
            conn = DriverManager  
                    .getConnection(url + dbName, userName, password);  
            
            pstomada = conn  
                   .prepareStatement("INSERT INTO omada SELECT * FROM players WHERE username=?; ");
            
            pstomada.setString(1,user);
            int i = pstomada.executeUpdate();
              
            if (i!=0){
                     
               
            pstgk = conn  
                   .prepareStatement("SELECT name FROM omada WHERE gk=(Select MAX(gk) FROM omada) "); 
            
                  
            
            pst1gk = conn  
                   .prepareStatement("SELECT gk FROM omada WHERE gk=(Select MAX(gk) FROM omada) ");
            
           
            
            ResultSet rsgk = pstgk.executeQuery();
            ResultSet rs1gk = pst1gk.executeQuery();
        
            String namegk=null;
            String ratgk=null;
            while (rsgk.next()) {
            namegk = rsgk.getString("name");
            
            }
            while (rs1gk.next()) {
                float ratinggk = rs1gk.getFloat("gk");
                ratgk = String.valueOf(ratinggk);
            }
            
            String labelgk  = namegk + ", " + ratgk;  
            
              

   
            
            pstdc = conn  
                   .prepareStatement("SELECT name FROM omada WHERE dc=(Select MAX(dc) FROM omada)"); 
            
           
            
            pst1dc = conn  
                   .prepareStatement("SELECT dc FROM omada WHERE dc=(Select MAX(dc) FROM omada)");
            
            
            
            ResultSet rsdc = pstdc.executeQuery();
            ResultSet rs1dc = pst1dc.executeQuery();
        
            String namedc=null;
            String ratdc=null;
            while (rsdc.next()) {
            namedc = rsdc.getString("name");
            
            }
            while (rs1dc.next()) {
                float ratingdc = rs1dc.getFloat("dc");
                ratdc = String.valueOf(ratingdc);
            }
            
            String labeldc  = namedc + ", " + ratdc;  
            
           
   
            
            
            
            
            pstsb = conn  
                   .prepareStatement("SELECT name FROM omada WHERE sb=(Select MAX(sb) FROM omada)"); 
            
      
            
            pst1sb = conn  
                   .prepareStatement("SELECT sb FROM omada WHERE sb=(Select MAX(sb) FROM omada)");
            
      
            
            ResultSet rssb = pstsb.executeQuery();
            ResultSet rs1sb = pst1sb.executeQuery();
        
            String namesb=null;
            String ratsb=null;
            while (rssb.next()) {
            namesb = rssb.getString("name");
            
            }
            while (rs1sb.next()) {
                float ratingsb = rs1sb.getFloat("sb");
                ratsb = String.valueOf(ratingsb);
            }
            
            String labelsb  = namesb + ", " + ratsb;  
            
            
            
            
            
            
            pstdm = conn  
                   .prepareStatement("SELECT name FROM omada WHERE dm=(Select MAX(dm) FROM omada)"); 
            
      
            
            pst1dm = conn  
                   .prepareStatement("SELECT dm FROM omada WHERE dm=(Select MAX(dm) FROM omada) ");
            

            
            ResultSet rsdm = pstdm.executeQuery();
            ResultSet rs1dm = pst1dm.executeQuery();
        
            String namedm=null;
            String ratdm=null;
            while (rsdm.next()) {
            namedm = rsdm.getString("name");
            
            }
            while (rs1dm.next()) {
                float ratingdm = rs1dm.getFloat("dm");
                ratdm = String.valueOf(ratingdm);
            }
            
            String labeldm  = namedm + ", " + ratdm;
            
            
            
            
          
                      
           
            pstmc = conn  
                   .prepareStatement("SELECT name FROM omada WHERE mc=(Select MAX(mc) FROM omada) "); 
            
         
            
            pst1mc = conn  
                   .prepareStatement("SELECT mc FROM omada WHERE mc=(Select MAX(mc) FROM omada)");
            
   
          
            ResultSet rsmc = pstmc.executeQuery();
            ResultSet rs1mc = pst1mc.executeQuery();
       
            String namemc=null;
            String ratmc=null;
            while (rsmc.next()) {
            namemc = rsmc.getString("name");
            
            }
            
    /*        while (rs1mc.next()) {
                float ratingmc = rs1mc.getFloat("mc");
                System.out.println("a");
                ratmc = String.valueOf(ratingmc);
            }
            */ 
            String labelmc  = namemc + ", " + 6.15;
         
        
            
           
            
            
            
            
            pstamc = conn  
                   .prepareStatement("SELECT name FROM omada WHERE amc=(Select MAX(amc) FROM omada) "); 
            
           
            
            pst1amc = conn  
                   .prepareStatement("SELECT amc FROM omada WHERE amc=(Select MAX(amc) FROM omada) ");
            
            
            
            ResultSet rsamc = pstamc.executeQuery();
            ResultSet rs1amc = pst1amc.executeQuery();
        
            String nameamc=null;
            String ratamc=null;
            while (rsamc.next()) {
            nameamc = rsamc.getString("name");
            
            }
            while (rs1amc.next()) {
                float ratingamc = rs1amc.getFloat("amc");
                ratamc = String.valueOf(ratingamc);
            }
            
            String labelamc  = nameamc + ", " + ratamc;
            
            
            
            
            
            
            
            
            pstams = conn  
                   .prepareStatement("SELECT name FROM omada WHERE ams=(Select MAX(ams) FROM omada) "); 
            
          
            
            pst1ams = conn  
                   .prepareStatement("SELECT ams FROM omada WHERE ams=(Select MAX(ams) FROM omada) ");
            
            
            
            ResultSet rsams = pstams.executeQuery();
            ResultSet rs1ams = pst1ams.executeQuery();
        
            String nameams=null;
            String ratams=null;
            while (rsams.next()) {
            nameams = rsams.getString("name");
            
            }
            while (rs1ams.next()) {
                float ratingams = rs1ams.getFloat("ams");
                ratams = String.valueOf(ratingams);
            }
            
            String labelams  = nameams + ", " + ratams;
            
            
            
            
            
            
            pstst = conn  
                   .prepareStatement("SELECT name FROM omada WHERE st=(Select MAX(st) FROM omada) "); 
            
            
            
            pst1st = conn  
                   .prepareStatement("SELECT st FROM omada WHERE st=(Select MAX(st) FROM omada) ");
            
            
            
            ResultSet rsst = pstst.executeQuery();
            ResultSet rs1st = pst1st.executeQuery();
        
            String namest=null;
            String ratst=null;
            while (rsst.next()) {
            namest = rsst.getString("name");
            
            }
            while (rs1st.next()) {
                float ratingst = rs1st.getFloat("st");
                ratst = String.valueOf(ratingst);
            }
            
            String labelst  = namest + ", " + ratst;
            
            
            
            
            
            
            
            pstdc2 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE dc=(Select MAX(dc) FROM omada WHERE dc<(Select MAX(dc) FROM omada)) "); 
            
         
            
            pst1dc2 = conn  
                   .prepareStatement("SELECT dc FROM omada WHERE dc=(Select MAX(dc) FROM omada WHERE dc<(Select MAX(dc) FROM omada)) ");
            
           
            
            ResultSet rsdc2 = pstdc2.executeQuery();
            ResultSet rs1dc2 = pst1dc2.executeQuery();
        
            String namedc2=null;
            String ratdc2=null;
            while (rsdc2.next()) {
            namedc2 = rsdc2.getString("name");
            
            }
            while (rs1dc2.next()) {
                float ratingdc2 = rs1dc2.getFloat("dc");
                ratdc2 = String.valueOf(ratingdc2);
            }
            
            String labeldc2  = namedc2 + ", " + ratdc2;

            
            
            
            
            
            
            pstmc2 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE mc=(Select MAX(mc) FROM omada WHERE mc<(Select MAX(mc) FROM omada)) "); 
            
            
            
            pst1mc2 = conn  
                   .prepareStatement("SELECT mc FROM omada WHERE mc=(Select MAX(mc) FROM omada WHERE mc<(Select MAX(mc) FROM omada))");
            
           
            
            ResultSet rsmc2 = pstmc2.executeQuery();
            ResultSet rs1mc2 = pst1mc2.executeQuery();
        
            String namemc2=null;
            String ratmc2=null;
            while (rsmc2.next()) {
            namemc2 = rsmc2.getString("name");
            
            }
            while (rs1mc2.next()) {
                float ratingmc2 = rs1mc2.getFloat("mc");
                ratmc2 = String.valueOf(ratingmc2);
            }
            
            String labelmc2  = namemc2 + ", " + ratmc2;
            
        

     
           
            
            
            pstsb2 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE sb=(Select MAX(sb) FROM omada WHERE sb<(Select MAX(sb) FROM omada)) "); 
            
            
            
            pst1sb2 = conn  
                   .prepareStatement("SELECT sb FROM omada WHERE sb=(Select MAX(sb) FROM omada WHERE sb<(Select MAX(sb) FROM omada)) ");
            
            
            
            ResultSet rssb2 = pstsb2.executeQuery();
            ResultSet rs1sb2 = pst1sb2.executeQuery();
        
            String namesb2=null;
            String ratsb2=null;
            while (rssb2.next()) {
            namesb2 = rssb2.getString("name");
            
            }
            while (rs1sb2.next()) {
                float ratingsb2 = rs1sb2.getFloat("sb");
                ratsb2 = String.valueOf(ratingsb2);
            }
            
            String labelsb2  = namesb2 + ", " + ratsb2;
            
            
            
            
            
            
            
            
            pstams2 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE ams=(Select MAX(ams) FROM omada WHERE ams<(Select MAX(ams) FROM omada)) "); 
            
            
            
            pst1ams2 = conn  
                   .prepareStatement("SELECT ams FROM omada WHERE ams=(Select MAX(ams) FROM omada WHERE ams<(Select MAX(ams) FROM omada))");
            
            
            
            ResultSet rsams2 = pstams2.executeQuery();
            ResultSet rs1ams2 = pst1ams2.executeQuery();
        
            String nameams2=null;
            String ratams2=null;
            while (rsams2.next()) {
            nameams2 = rsams2.getString("name");
            
            }
            while (rs1ams2.next()) {
                float ratingams2 = rs1ams2.getFloat("ams");
                ratams2 = String.valueOf(ratingams2);
            }
            
            String labelams2  = nameams2 + ", " + ratams2;
            
            
            
            
            
            
            
            pstst2 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE st=(Select MAX(st) FROM omada WHERE st<(Select MAX(st) FROM omada)) "); 
            
            
            
            pst1st2 = conn  
                   .prepareStatement("SELECT st FROM omada WHERE st=(Select MAX(st) FROM omada WHERE st<(Select MAX(st) FROM omada)) ");
            
            
            
            
            ResultSet rsst2 = pstst2.executeQuery();
            ResultSet rs1st2 = pst1st2.executeQuery();
        
            String namest2=null;
            String ratst2=null;
            while (rsst2.next()) {
            namest2 = rsst2.getString("name");
            
            }
            while (rs1st2.next()) {
                float ratingst2 = rs1st2.getFloat("st");
                ratst2 = String.valueOf(ratingst2);
            }
            
            String labelst2  = namest2 + ", " + ratst2;
            
            
            
            
            
            
            
            
            
            pstdc3 = conn  
                   .prepareStatement("SELECT name FROM omada WHERE dc=(Select MAX(dc) FROM omada WHERE dc<(Select MAX(dc) FROM omada WHERE dc<(SELECT MAX(dc) FROM omada))) "); 
            
           
            
            pst1dc3 = conn  
                   .prepareStatement("SELECT dc FROM omada WHERE dc=(Select MAX(dc) FROM omada WHERE dc<(Select MAX(dc) FROM omada WHERE dc<(SELECT MAX(dc) FROM omada))) ");
            
            
            
            ResultSet rsdc3 = pstdc3.executeQuery();
            ResultSet rs1dc3 = pst1dc3.executeQuery();
        
            String namedc3=null;
            String ratdc3=null;
            while (rsdc3.next()) {
            namedc3 = rsdc3.getString("name");
            
            }
            while (rs1dc3.next()) {
                float ratingdc3 = rs1dc3.getFloat("dc");
                ratdc3 = String.valueOf(ratingdc3);
            }
            
            String labeldc3  = namedc3 + ", " + ratdc3;
            
               
            
            pstdel = conn  
                   .prepareStatement("delete from omada; ");
            int y = pstdel.executeUpdate();
     
            
         if (forma.equals("352")) {
 
            request.setAttribute("terma",labelgk);
            request.setAttribute("amunk",labeldc);
            request.setAttribute("amund",labeldc2);
            request.setAttribute("amuna",labeldc3);
            request.setAttribute("khafd",labelmc);
            request.setAttribute("khafa",labelmc2);
            request.setAttribute("hafd",labelams2);
            request.setAttribute("hafa",labelams);
            request.setAttribute("khafk",labeldm);
            request.setAttribute("epia",labelst);
            request.setAttribute("epid",labelst2);
            RequestDispatcher rd=request.getRequestDispatcher("main352.jsp");
            rd.forward(request,response);
          }
        
         
         if (forma.equals("4231")) {
            request.setAttribute("terma",labelgk);
            request.setAttribute("amund",labeldc2);
            request.setAttribute("amuna",labeldc);
            request.setAttribute("deksib",labelsb);
            request.setAttribute("aristb",labelsb2);
            request.setAttribute("khafd",labelmc);
            request.setAttribute("khafa",labelmc2);
            request.setAttribute("hafd",labelams2);
            request.setAttribute("hafa",labelams);
            request.setAttribute("epihaf",labelamc);
            request.setAttribute("epik",labelst);
            RequestDispatcher rd=request.getRequestDispatcher("main4231.jsp");
            rd.forward(request,response);
          }
         
          if (forma.equals("451")) {
            request.setAttribute("terma",labelgk);
            request.setAttribute("amund",labeldc);
            request.setAttribute("amuna",labeldc2);
            request.setAttribute("deksib",labelsb);
            request.setAttribute("aristb",labelsb2);
            request.setAttribute("khafd",labelmc2);
            request.setAttribute("khafa",labelmc);
            request.setAttribute("hafd",labelams2);
            request.setAttribute("hafa",labelams);
            request.setAttribute("amuhaf",labeldm);
            request.setAttribute("epik",labelst);
            RequestDispatcher rd=request.getRequestDispatcher("main451.jsp");
            rd.forward(request,response);
          }
     
          if (forma.equals("433")) {
            request.setAttribute("terma",labelgk);
            request.setAttribute("amund",labeldc2);
            request.setAttribute("amuna",labeldc);
            request.setAttribute("deksib",labelsb);
            request.setAttribute("aristb",labelsb2);
            request.setAttribute("khafd",labelmc);
            request.setAttribute("khafa",labelmc2);
            request.setAttribute("fwd",labelams2);
            request.setAttribute("fwa",labelams);
            request.setAttribute("khafk",labeldm);
            request.setAttribute("epik",labelst);
            RequestDispatcher rd=request.getRequestDispatcher("main433.jsp");
            rd.forward(request,response);
          }
          
          if (forma.equals("442")) {
            request.setAttribute("terma",labelgk);
            request.setAttribute("amund",labeldc);
            request.setAttribute("amuna",labeldc2);
            request.setAttribute("deksib",labelsb);
            request.setAttribute("aristb",labelsb2);
            request.setAttribute("khafd",labeldm);
            request.setAttribute("khafa",labelmc);
            request.setAttribute("hafd",labelams2);
            request.setAttribute("hafa",labelams);
            request.setAttribute("epia",labelst2);
            request.setAttribute("epid",labelst);
            RequestDispatcher rd=request.getRequestDispatcher("main442.jsp");
            rd.forward(request,response);
          }
     
     
         }
             else if (i==0){

                        out.println("<br><p style=\"color:red\">FAIL</p>");

                    }
              
    }catch (Exception e2) {System.out.println(e2);}  
              
    out.close();  
    }  
      
    }  