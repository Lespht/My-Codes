<?php
session_start();
$var_value = $_SESSION['varname'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bienvenido</title>
</head>
    <body>
        <p>Bienvenido <?php echo $var_value;?></p>

    </body>
</html>
