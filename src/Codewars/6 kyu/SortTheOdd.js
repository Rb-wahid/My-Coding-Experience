function sortArray(array) {
  // Return a sorted array.
  const odd = array.filter((x) => x & 1).sort((a, b) => a - b);
  return array.map((x) => (x & 1 ? odd.shift() : x));
}

let array = [23, 48, -43, -29, 29, -22, 43, -38];
console.log(sortArray(array));
