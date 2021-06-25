function sumIntervals(intervals) {
  //TODO
  let arr = [];
  intervals.forEach((arrA) => {
    for (let i = arrA[0] + 1; i <= arrA[arrA.length - 1]; i++) {
      if (!arr.includes(i)) arr.push(i);
    }
  });
  return arr.length;
}

console.log(
  sumIntervals([
    [1, 2],
    [6, 10],
    [11, 15],
  ])
);
