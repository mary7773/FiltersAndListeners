<!DOCTYPE html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Login Form</title>
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>Login to Web App</h1>
      <form method="post" action="/FilersAndListeners/Login">
        <p><input type="text" name="username"  placeholder="Username or Email"></p>
        <p><input type="password" name="password" placeholder="Password"></p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
      </form>
    </div>

</body>
</html>