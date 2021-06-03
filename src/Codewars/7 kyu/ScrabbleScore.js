function scrabbleScore(str) {
  // ...
  return str.toUpperCase().split``.reduce(
    (score, v) => score + ($dict[v] || 0),
    0
  );
}

console.log(scrabbleScore("cabbage"));
