function maxValue(a,b,c){
	let maxVal=0;
	if(a>b){
		maxVal=a;
	}
	else{
		maxVal=b;
	}
	if(c>maxVal){
		maxVal=c;
	}
	return maxVal;
}
console.log(maxValue(2,9,14));