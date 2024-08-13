/**
 * Write a function that takes a string (a) and a number (n) as argument. Return the nth character of 'a'.
 */
function myFunction(a, n)
{
  return a[n-1];
}
console.log(myFunction("Anitha",3));

/*Write a function that takes a string as argument. Extract the last 3 characters from the string. Return the result.*/

function sliceFunction(str)
{
  return str.slice(3);
}
console.log(sliceFunction("Hello World"))