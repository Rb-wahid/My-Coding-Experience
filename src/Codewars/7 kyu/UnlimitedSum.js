function sum(...args) {
  //...
  return args
    .filter((el) => Number.isInteger(el))
    .reduce((sum, el) => sum + el, 0);
}
