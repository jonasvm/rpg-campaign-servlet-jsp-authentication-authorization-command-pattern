<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page
	import="java.util.List,br.com.rpg.campaign.model.PlayableCharacter"%>

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
			<h2 class="w3-text-light-grey">Detalhes do Usuário</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form>
				<table>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome:</td>
						<td width="50%"><input type="text" value="${ user.username }"
							disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Email:</td>
						<td width="50%"><input type="text" value="${ user.email }"
							disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Senha:</td>
						<td width="50%"><input type="password"
							value="${ user.password }" disabled></td>
					</tr>
				</table>
			</form>

			<c:if test="${listOfCharacters.size() >= 1}">

				<h2 class="w3-text-light-grey">Personagens do Usuário</h2>
				<ul>
					<c:forEach items="${listOfCharacters}" var="character">
						<li>${character.name} - <a
							href="/rpg-campaign/gameplay?action=CharacterDetails&id=${user.id}&character=${character.id}">[
								detalhes ]</a> - <a
							href="/rpg-campaign/gameplay?action=CharacterEdition&id=${user.id}&character=${character.id}">[
								editar ]</a></li>
					</c:forEach>
				</ul>

			</c:if>

			<%
				System.out.println("[ View ] : JSP formUserDetails acessada!");
			%>

		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
