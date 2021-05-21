
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href = "w3.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <style>
            .w3-bar-item{
                font-family: Schadow BT;
    font-size: large;
    letter-spacing: 0.9px;
            }
        </style>
    </head>
    <body>
        <div class="w3-bar w3-border w3-card-4 w3-light-grey">
  <a href="#" class="w3-bar-item w3-button">Veer-Tech</a>
  
  
  <div class ="w3-right">
      <form action ='logout' method='post'>
  <a href="insert_record.jsp" class="w3-bar-item w3-button ">Insert Record</a>
  <a href="employee_list.jsp" class="w3-bar-item w3-button">Check Records</a>
  
  <button type="submit" value="Submit" class="w3-bar-item w3-button w3-hover-blue-gray" style = 'border: none;
    background: none;'>Logout</button>
  </form>
  </div>
</div>
    </body>
</html>
