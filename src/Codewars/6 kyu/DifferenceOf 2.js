function twosDifference(input) {
  //Enter your solution here
  const diff = (a, b) => (b - a == 2 ? [a, b] : []);
  let rst = [];

  for (let a of input) {
    for (let b of input) {
      rst.push(diff(a, b));
    }
  }

  return rst.filter((arr) => arr.length != 0);
}

console.log(twosDifference([1, 2, 3, 4]));
