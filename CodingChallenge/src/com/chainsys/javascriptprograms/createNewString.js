function newStr(str){
	if(str.length>=3){
		let str1=str.substring(str.length-3);
		return str1+str+str1;
	}
	else{
		return false;
	}
}
console.log(newStr("ab"));
console.log(newStr("abcd")); 