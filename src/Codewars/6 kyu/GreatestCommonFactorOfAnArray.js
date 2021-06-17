function greatestCommonFactor(array) {
  // your code here
  let gcd = mygcd(array[0], array[1]);
  for (let i = 1; i < array.length; i++) {
    gcd = mygcd(gcd, array[i]);
  }
  return gcd;
}

function mygcd(a, b) {
  //your code here
  if (b === 0) return a;
  else return mygcd(b, a % b);
}
