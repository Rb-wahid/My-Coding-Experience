var uniqueInOrder = (iterable) =>
  [...iterable].filter((el, idx) => el !== iterable[idx - 1]);
let arr = ["s", "s", "s", "f", "sd", "d", "d"];
console.log(uniqueInOrder(arr));
