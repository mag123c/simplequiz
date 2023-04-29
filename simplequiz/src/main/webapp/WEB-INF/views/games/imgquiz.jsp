<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SimpleQuiz</title>
<link rel="stylesheet" href="/resources/css/games/imgquiz.css">
</head>
<body>
<%@ include file="/WEB-INF/views/nav.jsp" %>

	<div class="all_con">
		<div class="ads_con"></div>
		<div class="game_con">
			<div class="img_con"><img class="q_img"></div>
			<div class="ans_con">
				<input type="text" onkeypress="enter(event)">
				<button class="answer_btn">
					<img src="/resources/img/cursor.png">
				</button>
			</div>
		</div>
		<div class="ads_con"></div>
	</div>
	
	<!-- answer -->
	<div class="answer">
		<c:forEach var="answer" items="${list}">
			<span class="answer_span">${answer}</span>
		</c:forEach>
	</div>
	
<script src="/resources/js/games/imgquiz.js"></script>	
</body>
</html>