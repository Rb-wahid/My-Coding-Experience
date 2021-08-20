// Let's make a Cat constructor!
var Cat = (function () {
  // ... your code here.
  let arr = [];
  let func = function (name, weight) {
    if (name && weight) {
      Object.defineProperty(this, "name", {
        get: () => name,
      });
      Object.defineProperty(this, "weight", {
        get: () => weight,
        set: (newWeight) => (weight = newWeight),
      });
    } else {
      throw Error("Invalid");
    }

    arr.push(this);
  };

  func.averageWeight = function () {
    let sum = arr.reduce((sum, cat) => sum + cat.weight, 0);
    let avr = sum / arr.length;
    return avr;
  };

  return func;
})();
