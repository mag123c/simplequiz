const answer = document.querySelectorAll(".answer_span");	//answer dp:none
const q_img = document.querySelector(".q_img");				//item img
const ans_btn = document.querySelector(".answer_btn");		//answer btn
const input = document.querySelector("input");
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
	alert(cnt + "개 맞춤");
}

ans_btn.addEventListener('click', function(){
	answer_chk();
});

arrAdd();
img_change(idx);