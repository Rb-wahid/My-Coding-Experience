function sharedBits(a, b) {
  //   Your code here
  const converter = (el) =>
    el.toString(2).length < 4
      ? el.toString(2).padStart(4, "0")
      : el.toString(2);
  a = converter(a);
  b = converter(b);
  let count = 0;
  for (let i = 0; i < a.length; i++) {
    if (a[i] == 1 && a[i] === b[i]) count++;
  }

  return count >= 2;
}

console.log(sharedBits(33070, 4848));
