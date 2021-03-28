var uniqueInOrder = function (iterable) {
  //your code here - remember iterable can be a string or an array
  let arr = [];
  for (const el of iterable) {
    if (!arr.includes(el)) {
      arr.push(el);
    }
  }
  return arr;
};
console.log(uniqueInOrder("ABBCcAD"));
