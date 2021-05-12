function validate(n) {
  n = n.toString().split("");
  let sum = 0;
  let i = n.length - 1;
  while (i >= 0) {
    sum += Number(n[i]);
    i--;
    sum += valid(Number(n[i]) * 2);
    i--;
  }

  return sum % 10 === 0;
}

function valid(n) {
  return n > 9 ? n - 9 : n;
}
console.log(validate(2121));
