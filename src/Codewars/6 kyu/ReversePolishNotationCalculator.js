function calc(expr) {
  // TODO: Your awesome code here
  let cal = [];

  for (const v of expr.split` `) {
    let a = (b = 0);
    if (v == "+") {
      b = cal.pop();
      a = cal.pop();
      cal.push(a + b);
    } else if (v == "-") {
      b = cal.pop();
      a = cal.pop();
      cal.push(a - b);
    } else if (v == "*") {
      b = cal.pop();
      a = cal.pop();
      cal.push(a * b);
    } else if (v == "/") {
      b = cal.pop();
      a = cal.pop();
      cal.push(a / b);
    } else {
      cal.push(Number(v));
    }
  }
  return cal.pop();
}

console.log(calc("5 1 2 + 4 * + 3 -"));
