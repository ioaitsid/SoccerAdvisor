<html>
    <head>
        <link rel="stylesheet" type="text/css" href="index.css">
        <title> Football Advisor</title>
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
                <button onclick="location.href='main.jsp'" class="button_2"> Team </button>
                <button onclick="location.href='exit.do'" class="button_3"> LogOut </button>
                <button onclick="location.href='about2.jsp'" class="button_4"> About </button>
                   
            <div class="wellcomemsg">
                 <h1> Wellcome to Football Advisor!!! </h1>  
            </div>
            
            <div class="message">
                
                 <p>1.Make your team. </p>
                 <p>2.Add your friends. </p>
                 <p>3.Find the best combination on the pitch.</p>
                 <p>Sign up NOW!!!</p>
            </div>
             
        </div>
       
        
           
            
        
        
    </body>
    
</html>