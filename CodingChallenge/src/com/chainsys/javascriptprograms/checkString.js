function checkString(str){
	if(str===null || str===undefined || str.substring(0,2)==="Py"){
		return str;
	}
	else{
		return "Py"+str;
	}
}
console.log(checkString("Python"));
console.log(checkString("thon"));