function howMuchCoffee(events) {
  const arr = events
    .filter((v) => /^(cw|dog|cat|movie)$/.test(v.toLowerCase()))
    .reduce((a, b) => (/[a-z]/.test(b[0]) ? a + 1 : a + 2), 0);
  return arr < 4 ? arr : "You need extra sleep";
}

console.log(howMuchCoffee(["DOG", "CAT", "OTHER3"]));
