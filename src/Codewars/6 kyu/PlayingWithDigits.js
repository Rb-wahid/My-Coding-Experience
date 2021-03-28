function digPow(num, p) {
  // ...
    let n = num;
  let len = n.toString().length + p - 1;
  let last;
  let sum = 0;

  while (n !== 0 && len >= p) {
    last = parseInt(n % 10);

    sum += Math.pow(last, len);
    console.log(last, len, sum);
    n /= 10;
    len--;
  }
    let ans = sum / num;

    return parseInt(ans) !== ans ? -1 : ans;
}

console.log(digPow(89, 1));
