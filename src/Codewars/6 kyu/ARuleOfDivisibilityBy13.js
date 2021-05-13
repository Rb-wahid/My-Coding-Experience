function thirt(n) {
  // your code
  const d = [1, 10, 9, 12, 3, 4];
  let sum = n;

  while (1) {
    let temp = sum;
    sum = sum
      .toString()
      .split("")
      .reverse()
      .map((v, i) => {
        v = v * d[i % 6];
        return v;
      })
      .reduce((a, b) => a + b, 0);
    if (sum === temp) break;
  }
  return sum;
}

console.log(thirt(1111111111));
