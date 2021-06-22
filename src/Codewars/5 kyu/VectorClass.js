var Vector = function (components) {
  // TODO: Finish the Vector class.
  this.components = components;
};

Vector.prototype.add = function (b) {
  if (this.components.length === b.components.length) {
    let result = this.components.map((el, idx) => el + b.components[idx]);

    return result;
  } else {
    throw "error";
  }
};

Vector.prototype.subtract = function (b) {
  if (this.components.length === b.components.length) {
    let result = this.components.map((el, idx) => el - b.components[idx]);

    return result;
  } else {
    throw "error";
  }
};

Vector.prototype.dot = function (b) {
  if (this.components.length === b.components.length) {
    let result = this.components
      .map((el, idx) => el * b.components[idx])
      .reduce((a, b) => a + b, 0);

    return result;
  } else {
    throw "error";
  }
};

Vector.prototype.norm = function () {
  let result = this.components
    .map((el, idx) => Math.pow(el, 2))
    .reduce((a, b) => a + b, 0);

  return Math.sqrt(result);
};

Vector.prototype.toString = function () {
  return `(${this.components.toString()})`;
};

Object.prototype.equals = function (b) {
  let obj = this.components || this;
  return obj.every((el, idx) => el === b.components[idx]);
};

var a = new Vector([1, 2, 3]);
var b = new Vector([3, 4, 5]);

console.log(a.equals(new Vector([4, 6, 8])));
console.log(typeof a.add(b));
