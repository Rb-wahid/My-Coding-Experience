function findNextSquare(sq) {
  // Return the next square if sq is a perfect square, -1 otherwise
  let sqrt = Math.sqrt(sq);
  return sqrt % 1 ? -1 : Math.pow(sqrt + 1, 2);
}

console.log(findNextSquare(144));
