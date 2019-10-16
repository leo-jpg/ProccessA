<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Agregar Proceso</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Simple Task Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<!-- js -->
<script src="js/jquery-2.1.3.min.js" type="text/javascript"></script>
<!-- //js -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<link href='//fonts.googleapis.com/css?family=Poppins:400,300,500,600,700' rel='stylesheet' type='text/css'>
</head>
<body>
	<div class="main">
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                            <span class="icon-bar"> <a class="navbar-brand" href="index.jsp">Volver</a></span>
                        </button>
                    </div>
                </nav>
		<h1 class="w3layouts_head">Agregar Proceso</h1>
		<div class="w3layouts_main_grid">
			<form action="#" method="post" class="w3_form_post">
				<div class="w3_agileits_main_grid w3l_main_grid">
					<span class="agileits_grid">
						<label>Nombre Proceso<i>:</i></label>
						<input type="text" name="txtProceso" placeholder="Proceso 1" required="">
					</span>
				</div>
				<div class="agileits_main_grid w3_agileits_main_grid">
					<span class="wthree_grid">
						<label>Seleccione Usuario<i>:</i></label>
						<select id="category" name="category" required="">
							<option value="none">None</option>
							<option value="category1">Category1</option>
							<option value="category2">Category2</option>
							<option value="category3">Category3</option>
							<option value="category4">Category4</option>
						</select>
					</span>
				</div>
				<div class="w3_main_grid">
					<div class="w3_main_grid_right">
                                            <input type="submit" name="btnAgregar" value="Agregar Proceso">
					</div>
					<div class="clear"> </div>
				</div>
			</form>
		</div>
		<!-- Calendar -->
			<link rel="stylesheet" href="css/jquery-ui.css" />
			<script src="js/jquery-ui.js"></script>
			  <script>
					  $(function() {
						$( "#datepicker" ).datepicker();
					  });
			  </script>
	</div>
</body>
</html>