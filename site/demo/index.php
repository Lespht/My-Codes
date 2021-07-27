<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="index.css" rel="stylesheet" type="text/css">
        <meta charset="utf-8">
        <title>login</title>
    </head>
    <body>
  <body>
    <div class="login-page">
      <div class="form">
        <div class="login">
          <div class="login-header">
            <h3>LOGIN</h3>
            <p>Please enter your credentials to login.</p>
          </div>
        </div>
        <form method="post" action="validar.php" class="login-form">
          <input id="user" name="user" type="text" placeholder="username"/>
          <input id="password" name="password" type="password" placeholder="password"/>
          <button type="submit">login</button>
          <p class="message">Not registered? <a href="sign_up.php">Create an account</a></p>
        </form>
      </div>
    </div>
</body>
</body>
</html>