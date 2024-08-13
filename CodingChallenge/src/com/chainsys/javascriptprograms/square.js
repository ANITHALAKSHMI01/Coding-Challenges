/*Write a program to output the squares (using multiplication) of 
numbers from 1 to 5 on separate lines.*/
function square(a) {
	var square=a*a;
	return square;
}
for (var i = 1; i <= 5; i++) {
	console.log(i+"-"+square(i));
}
