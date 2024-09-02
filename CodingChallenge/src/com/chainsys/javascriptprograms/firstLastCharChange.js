function changeChar(str){
	if(str<=1){
		return str;
	}
	let str1=str.substring(1,str.length-1);
	return str.charAt(str.length-1)+str1+str.charAt(0);
}
console.log(changeChar("Kayal"));