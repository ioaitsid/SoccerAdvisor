

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    
    <head>
        <link rel="stylesheet" type="text/css" href="register.css">
        <title>Registration Form!</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    </head>
    <body>
        <p class="text">Registration Form</p>
        <div class="Reg">
        <form method="post" action="Reg.do">

        <span class="fontawesome-user"></span><input type="text" name="username" required placeholder="Username" autocomplete="off"> 
        <span class="fontawesome-envelope-alt"></span><input type="text" name="email" id="email" required placeholder="E-mail" autocomplete="off">
        <span class="fontawesome-lock"></span><input type="password" name="password" id="password" required placeholder="Password" autocomplete="off"> 
        <input type="submit" value="Register Now!!!" >    
        </div>
    </body>
</html>
