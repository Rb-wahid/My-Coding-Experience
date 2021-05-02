function findNextSquare(sq) {
  // Return the next square if sq is a perfect square, -1 otherwise
  let sqrt = Math.sqrt(sq);
  if (sqrt * sqrt === sq) return Math.pow(sqrt + 1, 2);
  return -1;
}

console.log(findNextSquare(155));
