function checkNo(a,b){
	if(a==8 || b==8){
		return true;
	}
	if(a+b==8 || a-b==8){
		return true;
	}
	return false;
}
console.log(checkNo(10,8));
console.log(checkNo(16, 8));
console.log(checkNo(24, 32));
console.log(checkNo(17, 18));