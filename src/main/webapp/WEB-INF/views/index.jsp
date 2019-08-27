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
	<!-- Entrances List -->
	<h1>Entrances</h1>
	<h3>Dungeons</h3>
	<ol>
	<c:forEach var="dungeon" items="${dungeonEntrances}">
		<li>${dungeon.entrance} | Type: ${dungeon.type}</li>
	</c:forEach>
	</ol>
	<h3>Underground</h3>
	<ol>
	<c:forEach var="grotto" items="${grottoEntrances}">
		<li>${grotto.entrance} | Type: ${grotto.type}</li>
	</c:forEach>
	</ol>
	<h3>Buildings</h3>
	<ol>
	<c:forEach var="building" items="${buildingEntrances}">
		<li>${building.entrance} | Type: ${building.type}</li>
	</c:forEach>
	</ol>
	
	<!-- Locations List -->
	<h1>Locations</h1>
	<h3>Dungeons</h3>
	<ol>
	<c:forEach var="dungeon" items="${dungeonNames}">
		<li>${dungeon.name} | Type: ${dungeon.type}</li>
	</c:forEach>
	</ol>
	<h3>Underground</h3>
	<ol>
	<c:forEach var="grotto" items="${grottoNames}">
		<li>${grotto.name} | Type: ${grotto.type}</li>
	</c:forEach>
	</ol>
	<h3>Buildings</h3>
	<ol>
	<c:forEach var="building" items="${buildingNames}">
		<li>${building.name} | Type: ${building.type}</li>
	</c:forEach>
	</ol>
</body>
</html>