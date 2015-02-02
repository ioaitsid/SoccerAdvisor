<html>
    <head>
        <link rel="stylesheet" type="text/css" href="main433.css">
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
                    <div class="gk"> <% String gk = (String)request.getAttribute("terma"); out.print(gk); %> </div>
                    <div class="dcr"> <% String dcr = (String)request.getAttribute("amund"); out.print(dcr); %> </div>
                    <div class="dcl"><% String dcl = (String)request.getAttribute("amuna"); out.print(dcl); %></div>
                    <div class="dr"> <% String dr = (String)request.getAttribute("deksib"); out.print(dr); %></div>
                    <div class="dl"> <% String dl = (String)request.getAttribute("aristb"); out.print(dl); %></div>
                    <div class="dm"> <% String dm = (String)request.getAttribute("khafk"); out.print(dm); %></div>
                    <div class="mcr"> <% String mcr = (String)request.getAttribute("khafd"); out.print(mcr); %></div>
                    <div class="mcl"><% String mcl = (String)request.getAttribute("khafa"); out.print(mcl); %></div>
                    <div class="amr"><% String amr = (String)request.getAttribute("fwd"); out.print(amr); %></div>
                    <div class="aml"><% String aml = (String)request.getAttribute("fwa"); out.print(aml); %></div>
                    <div class="st"><% String st = (String)request.getAttribute("epik"); out.print(st); %></div>

                </div>
        </div>
        
  </body>
    
</html>