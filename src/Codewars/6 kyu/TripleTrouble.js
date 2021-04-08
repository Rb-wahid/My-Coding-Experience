function tripledouble(num1, num2) {
  //code me
  let n1 = num1.toString().split("").sort();
  let n2 = num2.toString().split("").sort();
  let first = [];

  for (let i = 0; i < n1.length - 2; i++) {
    if (n1[i] === n1[i + 1] && n1[i + 1] === n1[i + 2]) {
      str = n1.slice(i, i + 1).join("");
      if (!first.includes(str)) first.push(str);
    }
  }

  for (let i = 0; i < n2.length - 1; i++) {
    if (n2[i] === n2[i + 1]) {
      if (first.includes(n2[i])) return 1;
    }
  }
  return 0;
}

console.log(tripledouble(857758444333666300, 77646166));
