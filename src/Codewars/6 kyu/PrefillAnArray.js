function prefill(n, v) {
  if (
    !isFinite(n) ||
    n < 0 ||
    !Number.isInteger(Number(n)) ||
    typeof n === "boolean"
  ) {
    throw new TypeError(`${n} is invalid`);
  }
  n = Number(n);
  let rst = [];

  while (n != 0) {
    rst.push(v);
    n--;
  }
  return rst;
}
