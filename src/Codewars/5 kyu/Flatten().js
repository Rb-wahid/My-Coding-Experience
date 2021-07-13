var flatten = function (...array) {
  // TODO: Program me
    const doSomthing = array =>  array.reduce((arr, curr) => arr.concat(Array.isArray(curr) ? doSomthing(curr) : curr), []);

  return array.reduce((arr, curr) => arr.concat(Array.isArray(curr) ? doSomthing(curr) : curr), []);
};

console.log(flatten("a", ["b", 2], 3, null, [[4], ["c"]]));