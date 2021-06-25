function sumStrings(a, b) {
  a = a.split``.reverse().join``;
  b = b.split``.reverse().join``;

  let carray = 0;
  let i = 0;
  let sum = [];

  while (i < a.length || i < b.length || carray != 0) {
    let aDigit = i < a.length ? +a[i] : 0;
    let bDigit = i < b.length ? +b[i] : 0;
    let digitSum = aDigit + bDigit + carray;
    sum.push("" + (digitSum % 10));
    carray = Math.floor(digitSum / 10);
    i++;
  }

  return sum.reverse().join``.replace(/^0+/, "");
}

console.log(sumStrings("5", "5"));
