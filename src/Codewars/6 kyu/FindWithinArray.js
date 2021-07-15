var findInArray = function (array, iterator) {
 return array.findIndex(iterator)
};

var trueIfEven = function (value, index) {
  return value % 2 === 0;
};

console.log(findInArray([1, 3, 5, 6, 7], trueIfEven));
