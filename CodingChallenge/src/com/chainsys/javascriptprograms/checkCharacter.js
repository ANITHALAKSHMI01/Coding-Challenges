function checkChar(str,ch){
	let flag=false;
	for(var i=0;i<str.length;i++){
		if(str.charAt(i)==ch && (i>=1 && i<=3)){
			flag=true;
			break;
		}
	}
	if(flag==true){
		return "Success";
	}
	return "Unsuccess";
}
console.log(checkChar("JavaScript",'a'));