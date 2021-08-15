function makeLooper(str) {
  // TODO: return a function that loops through 'str' on successive invocations
  let arr = [...str];
  return function () {
    const first = arr.shift();
    if (arr.length == 0) {
      arr = [...str];
    }
    return first;
  };
}
