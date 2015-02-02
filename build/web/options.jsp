<html>
    <head>
        <link rel="stylesheet" type="text/css" href="options.css">
        <title> Football Advisor Team Options</title>
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
                   
               
               
                <button onclick="location.href='add.jsp'" class="btn"> Add a player</button>
                
                    
                <button onclick="location.href='remove.jsp'" class="btn2"> Remove a Player </button>   
                <br> 
                
                
                
                <form method="post" action="calc.do"  class="dark-matter">
                     <h1>Choose Formation and Set up your Team
                     </h1>
                   
                     <label>
                            <span>4-4-2</span>
                            <input id="formation" type="radio" name="formation" value="442"/>
                     </label>
                    <br>
                    <label>
                            <span>4-5-1</span>
                            <input id="formation" type="radio" name="formation" value="451"/>
                     </label>   
                     <br>
                    <label>
                            <span>4-2-3-1</span>
                            <input id="formation" type="radio" name="formation" value="4231"/>
                     </label>
                      <br>
                     <label>
                            <span>4-3-3</span>
                            <input id="formation" type="radio" name="formation" value="433"/>
                     </label>
                     <br>
                    <label>
                            <span>3-5-2</span>
                            <input id="formation" type="radio" name="formation" value="352">
                     </label>
                     <br>
                    <label>
                           <span></span>
                           <input type="submit" class="button" value="Calculate!" />
                    </label>    
                </form>
        </div>
       
        
           
            
        
        
    </body>
    
</html>






