function Counter() {
  //quickly, now!
  //  this.check =
  let counter = 0;
  return {
    increment: function () {
      counter = counter + 1;
    },
    check: function () {
      return counter;
    },
  };
}

var myCounter = new Counter();
myCounter.increment();
myCounter.increment();
console.log(myCounter.check());
