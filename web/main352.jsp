<html>
    <head>
        <link rel="stylesheet" type="text/css" href="main352.css">
        <title>Mainpage Football Advisor!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body>
        <%
        if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
            response.sendRedirect("index.jsp");
        }
        %>
        
        
        <div class="plaisio">
            <div class="logo">
            
            </div>
               
                <button onclick="location.href='index2.jsp'" class="button_1"> Home </button>          
                <button onclick="location.href='options.jsp'" class="button_2"> Options</button>
                <button onclick="location.href='exit.do'" class="button_3"> LogOut </button>
                <button onclick="location.href='about2.jsp'" class="button_4"> About </button>
        
                <div class="formation">
                    <div class="gk"><% String gk = (String)request.getAttribute("terma"); out.print(gk); %> </div>
                    <div class="dcc"><% String dcc = (String)request.getAttribute("amunk"); out.print(dcc); %> </div>
                    <div class="dcr"><% String dcr = (String)request.getAttribute("amund"); out.print(dcr); %></div>
                    <div class="dcl"><% String dcl = (String)request.getAttribute("amuna"); out.print(dcl); %></div>
                    <div class="mcr"><% String mcr = (String)request.getAttribute("khafd"); out.print(mcr); %></div>
                    <div class="mcl"><% String mcl = (String)request.getAttribute("khafa"); out.print(mcl); %></div>
                    <div class="mr"><% String mr = (String)request.getAttribute("hafd"); out.print(mr); %></div>
                    <div class="ml"><% String ml = (String)request.getAttribute("hafa"); out.print(ml); %></div>
                    <div class="mcc"><% String mcc = (String)request.getAttribute("khafk"); out.print(mcc); %></div>
                    <div class="stl"><% String stl = (String)request.getAttribute("epia"); out.print(stl); %></div>
                    <div class="str"><% String str = (String)request.getAttribute("epid"); out.print(str); %></div>
                </div>
        </div>
        
  </body>
    
</html>