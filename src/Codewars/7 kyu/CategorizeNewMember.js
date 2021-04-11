function openOrSenior(data) {
  // ...
  let ans = [];
  for (const arr of data) {
    if (arr[0] >= 55 && arr[1] > 7) {
      ans.push("Senior");
    } else {
      ans.push("Open");
    }
  }
  return ans;
}

console.log(
  openOrSenior([
    [18, 20],
    [45, 2],
    [61, 12],
    [37, 6],
    [21, 21],
    [78, 9],
  ])
);
