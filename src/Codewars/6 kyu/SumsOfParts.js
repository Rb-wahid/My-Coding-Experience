function partsSums(ls) {
  // your code
  let a = ls.reverse();
  let arr = [0];
  a.map((v, i) => {
    arr.push(v + arr[i]);
    return arr;
  });
  return arr.reverse();
}

let ls = [0, 1, 3, 6, 10];

console.log(partsSums(ls));
