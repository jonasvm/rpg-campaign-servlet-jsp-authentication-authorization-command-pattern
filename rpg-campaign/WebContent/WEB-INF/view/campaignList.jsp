<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List,br.com.rpg.campaign.model.Campaign"%>

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
			<h2 class="w3-text-light-grey">Lista de Campanhas</h2>
			<hr style="width: 200px" class="w3-opacity">
			<ul>
				<c:forEach items="${campaignList}" var="campaign">
					<li>${campaign.id}-${campaign.campaignName} -
						${campaign.dungeonMaster.user.username} - <a
						href="${linkGamePlay}?action=CampaignDetails&id=${campaign.id}">[
							detalhes ]</a> - <a
						href="${linkGamePlay}?action=ShowCampaign&id=${campaign.id}">[
							editar ]</a> - <a
						href="${linkGamePlay}?action=RemoveCampaign&id=${campaign.id}">[
							remover ]</a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<c:import url="footer.jsp"></c:import>
		<%
			System.out.println("[ View ] : JSP campaignList acessada!");
		%>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
