function autocorrect(input) {
  return input.replace(/\b(you+|u)\b/gi, "your sister");
}

console.log(autocorrect("I miss you!"));
