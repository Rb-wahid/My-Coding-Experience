function sum(...x) {
  //your code
  let sum = x.reduce((sum, val) => sum + val, 0);
  return x.length > 1 ? sum : (arg = 0) => sum + arg;
}
