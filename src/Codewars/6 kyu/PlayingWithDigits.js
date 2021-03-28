function digPow(num, p) {
  let op = num
    .toString()
    .split("")
    .reduce((sum, el, idx) => sum + Math.pow(el, p + idx), 0);
  return op % num ? -1 : op / num;
}

console.log(digPow(89, 1));
