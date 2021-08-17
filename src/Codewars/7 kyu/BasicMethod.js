// Your code
Array.prototype.max = function () {
  let sort = this.sort((a, b) => b - a).map((el) => Number(el));
  return isNaN(sort.pop()) ? NaN : sort.shift();
};
