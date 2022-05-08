<%@page import="web.CreditModel"%>

<%
	CreditModel mod = (CreditModel) request.getAttribute("mod");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulateur crédit</title>
</head>
<body>
	test Crédit


	<div>
		<form action="controller.php" method="post">
			<table>

				<tr>
					<td>Montant:</td>
					<td><input type="tex" t nam/e="moantnt"></td>
				</tr>

				<tr>
					<td>Durée:</td>
					<td><input type="text" name="moantnt"></td>

				</tr>

				<tr>
					<td>Taux:</td>
					<td><input type="text" name="moantnt"></td>
				</tr>

				<tr>
					<td>Taux</td>
					<td><input type="submit" value="Calculer"></td>

				</tr>
			</table>



		</form>
	</div>

	<div>

		<table>

			<tr>
				<td>Mensualité:</td>

				<td><%=mod.getMensualite()%></td>


			</tr>


		</table>

	</div>



</body>
</html>