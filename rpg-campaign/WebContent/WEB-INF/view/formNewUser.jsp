<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/gameplay?action=NewUser" var="linkGamePlay" />

<!DOCTYPE html>
<html>
<c:import url="top.jsp"></c:import>
<body class="w3-black">
	<c:import url="icon-bar.jsp"></c:import>
	<c:import url="nav-bar.jsp"></c:import>
	<!-- Page Content -->
	<div class="w3-padding-large" id="main">
		<c:import url="header.jsp"></c:import>
		<div class="w3-content w3-justify w3-text-grey w3-padding-64"
			id="about">
			<h2 class="w3-text-light-grey">Cadastro de Usuário</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form action="${linkGamePlay}" method="post">
				<table>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome:</td>
						<td width="50%"><input type="text" name="name"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Email:</td>
						<td width="50%"><input type="text" name="email"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Senha:</td>
						<td width="50%"><input type="password" name="password"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%"></td>
						<td width="50%" align="right"><br> <input type="submit"
							value="Cadastrar"></td>
					</tr>
				</table>
			</form>
			<%
				System.out.println("[ View ] : JSP formNewUser acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
