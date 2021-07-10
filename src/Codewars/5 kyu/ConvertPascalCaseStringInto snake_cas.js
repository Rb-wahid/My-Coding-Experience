function toUnderscore(string) {
  // TODO: complete
  return String(string)
    .split(/(?=[A-Z])/)
    .join("_")
    .toLowerCase();
}

console.log(toUnderscore("MoviesAndBooks"));
