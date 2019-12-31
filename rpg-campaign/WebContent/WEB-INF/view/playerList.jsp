<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List,br.com.rpg.campaign.model.Player"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/gameplay" var="linkGamePlay" />

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
			<h2 class="w3-text-light-grey">Lista de Usuários</h2>
			<hr style="width: 200px" class="w3-opacity">
			<ul>
				<c:forEach items="${playerList}" var="player">
					<li>${player.id}-${player.username} - ${player.email} - <a
						href="${linkGamePlay}?action=UserDetails&id=${player.id}">[
							detalhes ]</a> - <a
						href="${linkGamePlay}?action=ShowUser&id=${player.id}">[
							editar ]</a> - <a
						href="${linkGamePlay}?action=RemoveUser&id=${player.id}">[
							remover ]</a></li>
				</c:forEach>
			</ul>
		</div>
		<c:import url="footer.jsp"></c:import>
		<%
			System.out.println("[ View ] : JSP playerList acessada!");
		%>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
