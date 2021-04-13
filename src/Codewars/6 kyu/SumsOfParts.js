function partsSums(arr) {
  // your code
    let ls = arr;
    ls.unshift(0);
    let sum = ls.reduce((p, c) => p + c, 0);

    return ls.map(V => sum = sum - V);
}

let ls = [0, 1, 3, 6, 10];

console.log(partsSums(ls));
