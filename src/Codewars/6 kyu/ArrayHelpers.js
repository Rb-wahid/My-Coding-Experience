Array.prototype.square = function () {
  return this.map((n) => n * n);
};

Array.prototype.cube = function () {
  return this.map((n) => n * n * n);
};

Array.prototype.sum = function () {
  return this.reduce((a, b) => a + b, 0);
};

Array.prototype.average = function () {
  return this.sum() / this.length;
};

Array.prototype.even = function () {
  return this.filter((el) => (el & 1) === 0);
};

Array.prototype.odd = function () {
  return this.filter((el) => (el & 1) === 1);
};

let numbers = [1, 5, 3, 4, 5];

console.log(numbers.sum());
