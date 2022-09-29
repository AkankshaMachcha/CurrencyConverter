<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
 	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  	<link rel="stylesheet" href="css/index.css">
<title>Currency Converter</title>

</head>
<body>
	<div class="clshead">
		<div id="head">
		<i class="fa fa-dollar" style="color:white;font-size:35px;"></i>
		<h1  style="display:inline-block;"> CURRENCY CONVERTER</h1></div>
	</div>
	<form action="CurrencyControler">
	<div class="container-sm">
			
		<div class="row" style="padding:20px;">
			<div class="col-4" style="margin-top:10px;">
				<h1 class="con">AMOUNT</h1>
				
					<div class="mb-2 input-icons">
						<i class="bi bi-currency-dollar icon"></i>
   						<input type="double" class="form-control input-field" id="currencyvalue" name="currencyvalue">
 					</div>
				
			</div>
			<div class="col-4" style="margin-top:10px;">
				<h1 class="con">FROM</h1>
				<select class="form-select classic" aria-label="Default select example" name="Currency1">
  				<option name="US Doller" value="US Doller">USD - US Doller</option>
  				<option name="Euro" value="Euro">EUR - Euro</option>
  				<option name="British Pound" value="British Pound">GBP - British Pound</option>
  				<option name="Japanese Yen" value="Japanese Yen">JPY - Japanese Yen</option>
  				<option name="Canadian Doller" value="Canadian Doller">CAD - Canadian Doller</option>
  				<option name="Indian Rupee" value="Indian Rupee">INR - Indian Rupee</option>
				</select>
			</div>
			<div class="col-4" style="margin-top:10px;">
				<h1 class="con">TO</h1>
				<select class="form-select classic" aria-label="Default select example" name="Currency2">	
  				<option name="US Doller" value="US Doller">USD - US Doller</option>
  				<option name="Euro" value="Euro">EUR - Euro</option>
  				<option name="British Pound" value="British Pound">GBP - British Pound</option>
  				<option name="Japanese Yen" value="Japanese Yen">JPY - Japanese Yen</option>
  				<option name="Canadian Doller" value="Canadian Doller">CAD - Canadian Doller</option>
  				<option name="Indian Rupee" value="Indian Rupee">INR - Indian Rupee</option>
				</select>
			</div>
		</div>
		<div class="row">
		<div class="col-6" style="margin-left:25px;" >			
			<%
 			String Currency1=(String)request.getAttribute("Currency1");
 			String Currency2=(String)request.getAttribute("Currency2");
 			Double price=(Double)request.getAttribute("price");
 			Double Amount=(Double)request.getAttribute("Amount");
 			String price1=String.format("%.2f",price);
 			%>
 			<%
 				if(price!=null){
 			%>
 				<h1 class="con" style="font-size:20px;"><%=Amount %> <%=Currency1%> =</h1>
 				<h1 class="con" style="color:#004c99;"><%=price1 %> <%=Currency2%></h1>
 			<%
 				}
 			%>
			</div>
			<div class="col-2"></div>
			<div class="col-2">
				<button class="button" type="submit" onlick="showAns()">Convert</button>
			</div>
			<div class="col-2"></div>
		</div>
	
	</div>
	</form>
	<div class="btm">
			<h7>Created by Akanksha Machcha</h7><br>
			<h7>contact - akanksha.machcha@mmit.edu.in</h7>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
 
</body>
</html>