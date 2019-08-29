<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OOT Randomizer Entrance Tracker</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cerulean/bootstrap.min.css" rel="stylesheet" integrity="sha384-C++cugH8+Uf86JbNOnQoBweHHAe/wVKN/mb0lTybu/NZ9sEYbd+BbbYtNpWYAsNP" crossorigin="anonymous">
</head>
<body>
<div class="row" style="background-color: lightgreen;">
	<div class="col-lg-3">
		<a href="/list-entrances">List Data</a><br>
	</div>
	<div class="col-lg-3">
		<form action="set-rules">
			<label for="rules">Entrance Shuffle Rule Set:</label><br>
			<input type="radio" name="rules" value="DUNGEONS_ONLY" checked>Dungeons Only<br>
			<input type="radio" name="rules" value="ALL_INDOORS">All Indoors<br>
			<input type="radio" name="rules" value="ALL_OVERWORLD">Everything<br>
			<input type="submit" value="Set Rules"><br>
		</form>
	</div>
</div>

<h1>Dungeons</h1>
<table class="table">
  <tr>
    <th>Entrance</th>
    <th>Dungeon Found</th>
  </tr>
  <c:forEach var="dungeon" items="${dungeonEntrances}">
  <tr>
    <td>${dungeon.entrance}</td>
    <td>
    	<select>
    		<option></option>
    		<c:forEach var="dungeon" items="${dungeonNames}">
    			<option>${dungeon.name}</option>
    		</c:forEach>
    	</select>
    </td>
  </tr>
  </c:forEach>
</table>
<c:if test="${indoors == 1}">
	<h1>Grottos</h1>
	<table class="table">
		<tr>
			<th>Entrance</th>
			<th>Location</th>
		</tr>
		<c:forEach var="grotto" items="${grottoEntrances}">
		<tr>
			<td>${grotto.entrance}</td>
			<td>
				<select>
		    		<option></option>
		    		<c:forEach var="grotto" items="${grottoNames}">
		    			<option>${grotto.name}</option>
		    		</c:forEach>
	    		</select>
			</td>
		</tr>
		</c:forEach>
	</table>
	<h1>Indoors</h1>
	<table class="table">
		<tr>
			<th>Entrance</th>
			<th>Location</th>
		</tr>
		<c:forEach var="building" items="${buildingEntrances}">
		<tr>
			<td>${building.entrance}</td>
			<td>
				<select>
		    		<option></option>
		    		<c:forEach var="building" items="${buildingNames}">
		    			<option>${building.name}</option>
		    		</c:forEach>
	    		</select>
			</td>
		</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>