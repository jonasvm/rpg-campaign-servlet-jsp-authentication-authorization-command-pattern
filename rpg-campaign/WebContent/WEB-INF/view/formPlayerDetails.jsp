<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/NewPlayer" var="linkNewPlayer" />

<!DOCTYPE html>
<html>
<title>Rpg Campaign</title>
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
			<h2 class="w3-text-light-grey">Detalhes do Jogador</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form action="${linkNewPlayer}" method="post">
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
						<td colspan="3"><hr></td>
					</tr>
					<tr>
						<td colspan="3"><h2 class="w3-text-light-grey">Ficha do
								Personagem</h2>
							<hr style="width: 200px" class="w3-opacity"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome do Personagem:</td>
						<td width="50%"><input type="text"
							value="${ character.name }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos:</td>
						<td width="50%"><input type="text"
							value="${ character.points }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Força:</td>
						<td width="50%"><input type="text"
							value="${ character.strength }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Habilidade:</td>
						<td width="50%"><input type="text"
							value="${ character.dexterity }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Resistência:</td>
						<td width="50%"><input type="text"
							value="${ character.endurance }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Armadura:</td>
						<td width="50%"><input type="text"
							value="${ character.armor }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Poder de Fogo:</td>
						<td width="50%"><input type="text"
							value="${ character.firePower }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Level:</td>
						<td width="50%"><input type="text"
							value="${ character.level }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Vida:</td>
						<td width="50%"><input type="text"
							value="${ character.hitPoints }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Magia:</td>
						<td width="50%"><input type="text"
							value="${ character.magicPoints }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Vantagens:</td>
						<td width="50%"><input type="text"
							value="${ character.advantages }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Desvantagens:</td>
						<td width="50%"><input type="text"
							value="${ character.disadvantages }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Tipos de Dano:</td>
						<td width="50%"><input type="text"
							value="${ character.damageTypes }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Magias Conhecidas:</td>
						<td width="50%"><input type="text"
							value="${ character.knownSpells }" disabled></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Dinheiro e Itens:</td>
						<td width="50%"><input type="text"
							value="${ character.moneyAndItems }" disabled></td>
					</tr>
				</table>
			</form>
			<%
				System.out.println("[ View ] : JSP formPlayerDetails acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
