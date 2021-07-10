function toUnderscore(string) {
  // TODO: complete

  if (typeof string != "string") return String(string);
  return string.split``.map((ch) => (/[A-Z]/.test(ch) ? "_" + ch : ch)).join``
    .slice(1)
    .toLowerCase();
}

console.log(toUnderscore("MoviesAndBooks"));
