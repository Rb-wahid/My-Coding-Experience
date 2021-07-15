var findInArray = function (array, iterator) {
  let el = array.find(iterator);
  return array.indexOf(el);
};

var trueIfEven = function (value, index) {
  return value % 2 === 0;
};

console.log(findInArray([1, 3, 5, 5, 8], trueIfEven));
