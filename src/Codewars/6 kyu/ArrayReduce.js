Array.prototype.reduce = function (process, initial) {
  // ...
  let arr = this.slice();
  let sum = initial || arr.shift();
  arr.forEach((el) => {
    sum = process(sum, el);
  });
  return sum;
};
