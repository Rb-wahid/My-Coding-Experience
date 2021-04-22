function josephusSurvivor(n, k) {
  //your code here
  let arr = [];
  let i = 0;
    let idx = 0;
    let step = k - 1;
  while (i !== n) {
    arr.push(++i);
  }
  while (arr.length > 1) {
      idx = (idx + step) % arr.length;
      arr.splice(idx, 1);
  }

  return arr.pop();
}

console.log(josephusSurvivor(14, 2));
