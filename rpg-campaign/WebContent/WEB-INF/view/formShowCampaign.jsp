<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
			<h2 class="w3-text-light-grey">Detalhes da Campanha</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form>
				<table>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome:</td>
						<td width="50%"><input type="text"
							value="${ campaign.campaignName }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Dungeon Master:</td>
						<td width="50%"><input type="text"
							value="${ campaign.dungeonMaster.user.username }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Data de Criação:</td>
						<td width="50%"><input type="text"
							value="<fmt:formatDate value="${ campaign.creationDate }" pattern="dd/MM/yyyy" />"
							disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Jogadores:</td>
						<td width="50%"><input type="text" name="dungeonMaster"
							value="${ campaign.playerList }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">NPCs:</td>
						<td width="50%"><input type="text"
							value="${ campaign.nonPlayableCharacterList }" disabled></td>
					</tr>
				</table>
			</form>
			<%
				System.out.println("[ View ] : JSP formShowCampaign acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>