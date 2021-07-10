function calc(expr) {
  // TODO: Your awesome code here
  let operands = {
    "+": (b, a) => a + b,
    "-": (b, a) => a - b,
    "*": (b, a) => a * b,
    "/": (b, a) => a / b,
  };
  return expr.split` `
    .reduce((stack, current) => {
      let a,
        b,
        res = 0;
      if (operands[current]) {
        a = stack.pop();
        b = stack.pop();
        res = operands[current](a, b);
        stack.push(res);
      } else {
        stack.push(Number(current));
      }
      return stack;
    }, [])
    .pop();
}

console.log(calc("5 1 2 + 4 * + 3 -"));
