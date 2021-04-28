function bingo(a) {
  // your winning code here
  let arr = [2, 9, 14, 7, 15];

  return arr.every((e) => a.includes(e)) ? "WIN" : "LOSE";
}
console.log(bingo([21, 13, 2, 7, 5, 14, 7, 15, 9, 10]));
