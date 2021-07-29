function Counter() {
  //quickly, now!
  let counter = 0;

  this.check = function () {
    return counter;
  };
  this.increment = function () {
    counter += 1;
  };
}

var myCounter = new Counter();
myCounter.increment();
myCounter.increment();
console.log(myCounter);
