//game join
function join(e){
	let text = e.lastElementChild.innerText;
	let chkNum = textCheck(text);
	
	if(chkNum=="1"){
		location.href="/lol/items";
	}
}


//what game??? check (return int)
function textCheck(text){
	if(text == "LOL 아이템 이름 맞추기"){
		return "1";
	}
}




