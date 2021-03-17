// TODO
//square(), cube(), average(), sum(), even() and odd().
Array.prototype.square = function () {
    let array = this;
    let arr = [];

    for (let i = 0; i < array.length; i++) {
        arr.push(array[i] * array[i]);
    }
    return arr;
};

Array.prototype.cube = function () {
    let array = this;
    let arr = [];

    for (let i = 0; i < array.length; i++) {
        arr.push(array[i] * array[i] * array[i]);
    }
    return arr;
}

Array.prototype.average = function () {
    
    return this.sum() / this.length;
}

Array.prototype.sum = function () {
    let array = this;
    let sum = 0;

    for (let i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
}

Array.prototype.even = function () {
    let array = this;
    let arr = [];

    for (let i = 0; i < array.length; i++) {
        if ((array[i] & 1) === 0) {
            arr.push(array[i]);
        }
    }
    return arr;
}

Array.prototype.odd = function () {
  let array = this;
  let arr = [];

  for (let i = 0; i < array.length; i++) {
    if ((array[i] & 1) === 1) {
      arr.push(array[i]);
    }
  }
  return arr;
};

let numbers = [1, 2, 3, 4, 5];

console.log(numbers.odd());
