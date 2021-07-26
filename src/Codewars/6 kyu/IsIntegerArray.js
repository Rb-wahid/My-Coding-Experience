function isIntArray(arr) {
  return arr ? arr.every((el) => Number.isInteger(el)) : false;
}
