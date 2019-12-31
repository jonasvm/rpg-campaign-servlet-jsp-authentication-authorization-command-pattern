<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
			<h2 class="w3-text-light-grey">Como Usar?</h2>
			<hr style="width: 200px" class="w3-opacity">
			<p>Para utilizar o sistema, Siga os passos:</p>
			<ol>
				<li>Crie um Dungeon Master (mestre)</li>
				<li>Crie os personagens do jogo</li>
				<li>Crie uma campanha</li>
			</ol>
			<p>Depois disso, e so entrar na sua nova campanha e gerenciar a
				mesa de jogo!</p>
			<%
				System.out.println("[ View ] : JSP welcome acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>