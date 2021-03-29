function zero(middle) {
  if (typeof middle === "undefined") return 0;
  return oparation(0, middle);
}
function one(middle) {
  if (typeof middle === "undefined") return 1;
  return oparation(1, middle);
}
function two(middle) {
  if (typeof middle === "undefined") return 2;
  return oparation(2, middle);
}
function three(middle) {
  if (typeof middle === "undefined") return 3;
  return oparation(3, middle);
}
function four(middle) {
  if (typeof middle === "undefined") return 4;
  return oparation(4, middle);
}
function five(middle) {
  if (typeof middle === "undefined") return 5;
  return oparation(5, middle);
}
function six(middle) {
  if (typeof middle === "undefined") return 6;
  return oparation(6, middle);
}
function seven(middle) {
  if (typeof middle === "undefined") return 7;
  return oparation(7, middle);
}
function eight(middle) {
  if (typeof middle === "undefined") return 8;
  return oparation(8, middle);
}
function nine(middle) {
  if (typeof middle === "undefined") return 9;
  return oparation(9, middle);
}

function plus(right) {
  return "+" + right;
}
function minus(right) {
  return "-" + right;
}
function times(right) {
  return "*" + right;
}
function dividedBy(right) {
  return "/" + right;
}

function oparation(left, middle) {
  let arr = middle.split("");
  let op = arr[0];
  let right = Number(arr[1]);
  switch (op) {
    case "*":
      return left * right;
    case "/":
      return parseInt(left / right);
    case "+":
      return left + right;
    case "-":
      return left - right;
  }
}
