const answer = document.querySelectorAll(".answer_span");	//answer dp:none
const q_img = document.querySelector(".q_img");				//item img
const ans_btn = document.querySelector(".answer_btn");		//answer btn
const input = document.querySelector("input");				//answer input
const game_con = document.querySelector(".game_con");		//game container
const result_con = document.querySelector(".result_con");	//result container
const result_txt = document.querySelector(".result_txt");	//result txt
const restart_btn = document.querySelector(".restart_btn");	//restart button
const home_btn = document.querySelector(".home_btn");	//home button
var nameArr = [];
var imgArr = [];
var idx = 0;
var cnt = 0;

/* answer arr make */
function arrAdd(){
	answer.forEach(function(a){
		let name = a.textContent.split("=")[0].replace("{", "");
		let img = a.textContent.split("=")[1].replace("}", "");
		nameArr.push(name);
		imgArr.push(img);
	})
	console.log(nameArr);
	console.log(imgArr);
};

/* answer_chk */
function answer_chk(){
	let val = input.value.replaceAll(" ", "");	
	if(val == "BF대검") val = "B.F.대검";
	console.log(val);
	if(val == nameArr[idx]){
		alert("정답");
		cnt++;
	}
	else {
		alert("오답(" + nameArr[idx] + ")");
	}
	
	if(idx==9) result(cnt);
	idx++;
	img_change(idx);
	input.value="";
}

/* img change */
function img_change(idx){
	q_img.src = imgArr[idx];
}

/* input enter chk */
function enter(e){
	if(e.keyCode == 13){
		answer_chk();
	}
}

/* game end */
function result(cnt){
	let span = document.createElement("span");
	span.innerText = cnt+"개 맞추셨습니다. 계속 하시겠습니까?";
	result_txt.append(span);
	game_con.style.display = "none";
	result_con.style.display = "block";
}

restart_btn.addEventListener('click', function(){
	location.href="/lol/items";
})

home_btn.addEventListener('click', function(){
	location.href="/";
})
	

ans_btn.addEventListener('click', function(){
	answer_chk();
});

arrAdd();
img_change(idx);