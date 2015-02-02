<html>
    <head>
        <link rel="stylesheet" type="text/css" href="remove.css">
        <title> Soccer Advisor Team Options</title>
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
                   
                    
                
                    <form method="post" action="remove.do"  class="dark-matter">
                          <h1>Search Player to Remove </h1>
                        
                            <label>
                                 <span>Player's Name:</span>
                                 <input id="name" type="name" name="name"/>
                            </label>
 
                            <label>
                                <span></span>
                                <input type="submit" class="button" value="Remove" />
                            </label>    
                       
           
                    </form>
                 
        </div>
   
    </body>
    
</html>