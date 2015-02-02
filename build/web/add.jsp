<html>
    <head>
        <link rel="stylesheet" type="text/css" href="add.css">
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
                   
                    
                
                    <form method="post" action="Add.do"  class="dark-matter">
                          <h1>Player's Attributes Form
                             <span>Please fill all the texts in the fields.(range:1-20)</span>
                            </h1>
                        
                            <label>
                                 <span>Name:</span>
                                 <input id="name" type="name" name="name"/>
                            </label>
                        
                        <br>
                        
                            <label>
                                 <span>Heading:</span>
                                 <input id="heading" type="number" name="heading" min="1" max="20" />
                            </label>
   
                            <label>
                                 <span>Passing:</span>
                                 <input id="passing" type="number" name="passing" min="1" max="20"/>
                            </label>
                        
                                
                            <label>
                                 <span>Crossing:</span>
                                 <input id="crossing" type="number" name="crossing" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Shooting:</span>
                                 <input id="shooting" type="number" name="shooting" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Defending:</span>
                                 <input id="defending" type="number" name="defending" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Technique:</span>
                                 <input id="technique" type="number" name="technique" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Goalkeeping:</span>
                                 <input id="goalkeeping" type="number" name="goalkeeping" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Anticipation:</span>
                                 <input id="anticipation" type="number" name="anticipation" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Bravery:</span>
                                 <input id="bravery" type="number" name="bravery" min="1" max="20"/>
                            </label>
                                                    
                            <label>
                                 <span>Creativity:</span>
                                 <input id="creativity" type="number" name="creativity" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Off the ball:</span>
                                 <input id="offtheball" type="number" name="offtheball" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Positioning:</span>
                                 <input id="positioning" type="number" name="positioning" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Work rate:</span>
                                 <input id="workrate" type="number" name="workrate" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Composure:</span>
                                 <input id="composure" type="number" name="composure" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Teamwork:</span>
                                 <input id="teamwork" type="number" name="teamwork" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Stamina:</span>
                                 <input id="stamina" type="number" name="stamina" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Speed:</span>
                                 <input id="speed" type="number" name="speed" min="1" max="20"/>
                            </label>
                        
                            <label>
                                 <span>Weight (in kg):</span>
                                 <input id="weight" type="number" name="weight" min="40" max="120"/>
                            </label>
                        
                            <label>
                                 <span>Height (in cm):</span>
                                 <input id="height" type="number" name="height" min="145" max="220"/>
                            </label>
                      
                            <label>
                                <span></span>
                                <input type="submit" class="button" value="submit" />
                            </label>    
                        
                            
                    </form>
                 
        </div>
   
    </body>
    
</html>