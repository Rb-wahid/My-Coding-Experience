function towerBuilder(n) {
  let ans = [];
  let str = [..."".padEnd(n * 2 - 1, "*")];
  let i = 0;
  let len = str.length - 1;
  let mid = Math.floor(str.length / 2);
  while (i != mid + 1) {
    ans.push(str.join(""));
    str.splice(i, 1, " ");
    str.splice(len - i, 1, " ");
    i++;
  }

  return ans.reverse();
}

console.log(towerBuilder(6));
