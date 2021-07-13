var flatten = function (...array) {
  // TODO: Program me
  return array.reduce(
    (arr, curr) =>
      arr.concat(Array.isArray(curr) ? flatten.apply(null, curr) : curr),
    []
  );
};

console.log(flatten("a", ["b", 2], 3, null, [[4], ["c"]]));
