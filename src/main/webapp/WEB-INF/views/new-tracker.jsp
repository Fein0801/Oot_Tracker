<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lumen/bootstrap.min.css" rel="stylesheet" integrity="sha384-iqcNtN3rj6Y1HX/R0a3zu3ngmbdwEa9qQGHdkXwSRoiE+Gj71p0UNDSm99LcXiXV" crossorigin="anonymous">
</head>
<body>
	<div id="ruleset" style="background-color: lightgreen;">
		<form action="set-rules">
			<label for="rules">Entrance Shuffle Rule Set:</label><br>
			<input type="radio" name="rules" value="DUNGEONS_ONLY" checked>Dungeons Only<br>
			<input type="radio" name="rules" value="SIMPLE_INDOORS">Simple Indoors<br>
			<input type="radio" name="rules" value="ALL_INDOORS">All Indoors<br>
			<input type="radio" name="rules" value="ALL_OVERWORLD">All Indoors and Overworld<br>
			<input type="submit" value="Set Rules"><br>
		</form>
	</div>
</body>
</html>