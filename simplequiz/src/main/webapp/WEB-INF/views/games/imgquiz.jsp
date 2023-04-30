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
					<img src="/resources/img/next.png">
				</button>
			</div>
		</div>
		<div class="ads_con"></div>
	</div>
	
	<div class="result_con">
		<div class="result_txt"></div>
		<div class="result_btn">
			<button class="home_btn">
				<div class="result_home"><img src="/resources/img/home.png"><span>홈으로</span></div>
			</button>
			<button class="restart_btn">
				<div class="result_restart"><img src="/resources/img/restart.png"><span>재시작</span></div>
			</button>			
		</div>
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