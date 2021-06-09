function positiveToNegative(b) {
  // your code here
  b = b.map((a) => a ^ 1);

  for (let i = b.length - 1; i >= 0; i--) {
    b[i] = b[i] ^ 1;
    if (b[i]) break;
  }
  return b;
}

console.log(positiveToNegative([1, 1, 1, 0]));
