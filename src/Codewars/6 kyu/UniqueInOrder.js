var uniqueInOrder = function (iterable) {
  //your code here - remember iterable can be a string or an array
  let arr = [];
  if (typeof iterable === "string") iterable = iterable.split("");
  for (let i = 0; i < iterable.length; i++) {
    if (iterable[i] !== iterable[i + 1]) {
      arr.push(iterable[i]);
    }
  }
  return arr;
};
let arr = [ "s","s", "s", "f", "sd", "d", "d"];
console.log(uniqueInOrder(arr));
