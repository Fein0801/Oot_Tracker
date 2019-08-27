<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OOT Randomizer Entrance Tracker</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lumen/bootstrap.min.css" rel="stylesheet" integrity="sha384-iqcNtN3rj6Y1HX/R0a3zu3ngmbdwEa9qQGHdkXwSRoiE+Gj71p0UNDSm99LcXiXV" crossorigin="anonymous">
</head>
<body>
<div class="row" style="background-color: lightgreen;">
<div class="col-lg-3">
	<a href="/list-entrances">List Data</a><br>
</div>
<div class="col-lg-3">
	<form action="set-rules">
		<input type="radio" name="rules" value="DUNGEONS_ONLY" checked>Dungeons Only<br>
		<input type="radio" name="rules" value="ALL_INDOORS">All Indoors<br>
		<input type="radio" name="rules" value="ALL_OVERWORLD">Everything (You poor bastard)<br>
		<input type="submit" value="Set Rules"><br>
	</form>
	</div>
</div>
</body>
</html>