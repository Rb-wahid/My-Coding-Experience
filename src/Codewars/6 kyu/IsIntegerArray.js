function isIntArray(arr) {
  return Array.isArray(arr) && arr.every((el) => Number.isInteger(el));
}
