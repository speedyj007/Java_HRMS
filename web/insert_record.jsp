<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert New Employee Records</title>
        
        <style>
            /* Chrome, Safari, Edge, Opera */
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type=number] {
  -moz-appearance: textfield;
}
</style>
    </head>
    <body>
                <%
            if(session.getAttribute("email")==null)
            {
                response.sendRedirect("index.html");
            }
        %>
        
        <jsp:include page="header.jsp"/>
        <br>
        <div class ="w3-container" style='margin-top: 45px;'>
        
            <form name = "form2" action="insert_details" method="post">
                
                <div class ="w3-row-padding">
                    
                   <div class ="w3-half"> 
                <label class="l1">First Name : &nbsp;
                    <input type ='text'  class ='t1' style ='width:60%' placeholder='Enter First Name' name ='fname' required="">
                </label>
                   </div>
                    
                    <div class ="w3-half"> 
                <label class="l1">Last Name : &nbsp;
                    <input type ='text'  class ='t1' style ='width:60%' placeholder='Enter Last Name' name ='lname' required="">
                </label>
                    </div>
                    
                </div>
                
                <br><br>
                              
                <div class ="w3-row-padding" >
                    
                   <div class ="w3-half"> 
                <label class="l1">Mobile No : &nbsp;
                    <input  oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" type ='number'  class ='t1' style ='width:60%' maxlength="10"  minlength="10" placeholder='Enter Mobile Number' name ='mobile' required="">
                </label>
                   </div>
                    
                    <div class ="w3-half"> 
                <label class="l1">Age : &nbsp;
                    <input oninput="javascript: if (this.value.length > this.maxLength) this.value = this.value.slice(0, this.maxLength);" type ='number'  class ='t1' style ='width:60%' maxlength="2"  minlength="2" placeholder='Enter age' name ='age' required="">
                </label>
                    </div>
                    
                </div>
                
                <br><br>
                <div class ="w3-row-padding" >
                    
                   <div class ="w3-half"> 
                <label class="l1">Enter Dept. : &nbsp;
                    <input  type ='text'  class ='t1' style ='width:60%' placeholder='Enter Department' name ='dept' required="">
                </label>
                   </div>
                    
                    <div class ="w3-half"> 
                <label class="l1">Enter Designation . : &nbsp;
                    <input  type ='text'  class ='t1' style ='width:60%' placeholder='Enter designation' name ='desig' required="">
                </label>
                    </div>
                    
                </div>
                <br><br>
                
                <button type="submit" value="Submit" class="w3-button w3-blue w3-border w3-border-white w3-round-large">Submit</button> &nbsp;
                <button type="reset" value="reset" class="w3-button w3-blue w3-border w3-border-white w3-round-large">Clear</button>
                
            </form>
        </div>
    </body>
</html>
