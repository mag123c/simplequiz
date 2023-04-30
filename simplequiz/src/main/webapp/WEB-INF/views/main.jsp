<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SimpleQuiz</title>
<link rel="stylesheet" href="/resources/css/main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
<div class="all_con">
<%@ include file="/WEB-INF/views/nav.jsp" %>
	<div class="main_con">
		<div class="game_con">
			<div class="game_section" onclick="join(this)">
				<div class="img_con"><img class="lavadon" src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
			<div class="game_section" onclick='join(this)'>
				<div class="img_con"><img src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
			<div class="game_section" onclick='join(this)'>
				<div class="img_con"><img src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
			<div class="game_section" onclick='join(this)'>
				<div class="img_con"><img src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
			<div class="game_section" onclick='join(this)'>
				<div class="img_con"><img src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
			<div class="game_section" onclick='join(this)'>
				<div class="img_con"><img src="http://ddragon.leagueoflegends.com/cdn/13.8.1/img/item/3089.png"></div>				
				<div class="text_con"><span>LOL 아이템 이름 맞추기</span></div>				
			</div>
		</div>
	</div>
</div>
<script src="/resources/js/main.js"></script>
</body>
</html>