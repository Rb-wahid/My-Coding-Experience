function swapVowelCase(str) {
  // your code here
  return str.replace(/[aeiou]/gi, (ch) =>
    /[aeiou]/.test(ch) ? ch.toUpperCase() : ch.toLowerCase()
  );
}
