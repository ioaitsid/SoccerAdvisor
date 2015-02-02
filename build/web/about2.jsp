<html>
    <head>
        <link rel="stylesheet" type="text/css" href="about.css">
        <title> About Football Advisor</title>
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
                <button onclick="location.href='about2.jsp  '" class="button_4"> About </button>
                   
            <div class="wellcomemsg">
                 <h1> About Football Advisor!!! </h1>  
            </div>
            
            <div class="message">
                
                 <p>  Football Advisor is a an academic project.</p>
                 <p>The project's purpose was to make a website of our interest</p>
                 <p>and practice what we learned in theory.</p>
                
                 <p>Web Technologies 2015,Univeristy of Thessaly</p>
                 <br>
            </div>
             
        </div>
       
        
           
            
        
        
    </body>
    
</html>