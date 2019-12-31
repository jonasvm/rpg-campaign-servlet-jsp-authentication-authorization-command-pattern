<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.List,br.com.rpg.campaign.model.User"%>

<c:url value="/gameplay?action=NewCampaign" var="linkGamePlay" />

<!DOCTYPE html>
<html>
<c:import url="top.jsp"></c:import>
<body class="w3-black">
	<c:import url="icon-bar.jsp"></c:import>
	<c:import url="nav-bar.jsp"></c:import>
	<!-- Page Content -->
	<div class="w3-padding-large" id="main">
		<c:import url="user-actions.jsp"></c:import>
		<c:import url="header.jsp"></c:import>
		<div class="w3-content w3-justify w3-text-grey w3-padding-64"
			id="about">
			<h2 class="w3-text-light-grey">Cadastro de Campanha</h2>
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
						<td width="30%">Dungeon Master:</td>
						<td width="50%"><select name="dungeonMaster">
								<option>Selecione um Dungeon Master</option>
								<c:forEach items="${dmList}" var="dm">
									<option value="${dm.user.id}">${dm.user.username}</option>
								</c:forEach>
						</select></td>
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
				System.out.println("[ View ] : JSP formNewCampaign acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>