function mygcd(a, b) {
  //your code here
  if (b === 0) return a;
  else return mygcd(b, a % b);
}
