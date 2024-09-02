function checkString(str){
	if(str.length<4){
		return false;
	}
	let newStr=str.substring(0,4);
	if(newStr=="Java"){
		return "Contains Java"
	}
	else{
		return false;
	}
}
console.log(checkString("JavaScript"));
console.log(checkString("abc"));