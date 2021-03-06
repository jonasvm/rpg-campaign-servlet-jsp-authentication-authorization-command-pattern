<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/gameplay?action=NewPlayer" var="linkGamePlay" />

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
			<h2 class="w3-text-light-grey">Cadastrando personagem para:</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form action="${linkGamePlay}" method="post">
				<table>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome:</td>
						<td width="50%"><input type="text" name="name"
							value=${ loggedUser.username } readonly></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Email:</td>
						<td width="50%"><input type="text" name="email"
							value="${ loggedUser.email }" readonly></td>
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
						<td width="50%"><input type="text" name="characterName"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos:</td>
						<td width="50%"><input type="text" name="points"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">For�a:</td>
						<td width="50%"><input type="text" name="strength"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Habilidade:</td>
						<td width="50%"><input type="text" name="dexterity"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Resist�ncia:</td>
						<td width="50%"><input type="text" name="endurance"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Armadura:</td>
						<td width="50%"><input type="text" name="armor"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Poder de Fogo:</td>
						<td width="50%"><input type="text" name="firepower"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Level:</td>
						<td width="50%"><input type="text" name="level"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Vida:</td>
						<td width="50%"><input type="text" name="hitPoints"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Magia:</td>
						<td width="50%"><input type="text" name="magicPoints"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Vantagens:</td>
						<td width="50%"><input type="text" name="advantages"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Desvantagens:</td>
						<td width="50%"><input type="text" name="disadvantages"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Tipos de Dano:</td>
						<td width="50%"><input type="text" name="damageTypes"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Magias Conhecidas:</td>
						<td width="50%"><input type="text" name="knownSpells"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Dinheiro e Itens:</td>
						<td width="50%"><input type="text" name="moneyAndItems"></td>
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
				System.out.println("[ View ] : JSP formNewPlayer acessada!");
			%>
		</div>
		<c:import url="footer.jsp"></c:import>
		<!-- END PAGE CONTENT -->
	</div>
</body>
</html>
