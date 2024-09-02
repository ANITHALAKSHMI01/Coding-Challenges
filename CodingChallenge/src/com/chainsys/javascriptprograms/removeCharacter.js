function remove(str,n){
	var str1=str.substring(0,n);
	var str2=str.substring(n+1,str.length);
	return str1+str2;
}
console.log(remove("Nikil",1));