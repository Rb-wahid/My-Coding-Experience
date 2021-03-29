function narcissistic(value) {
  // Code me to return true or false
  let valueStr = value.toString();
  let len = valueStr.length;
  let ans = 0;

  for (const el of valueStr) {
    ans += Math.pow(Number(el), len);
  }

  return ans === value;
}

console.log(narcissistic(371));
