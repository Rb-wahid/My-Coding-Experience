function swapVowelCase(str) {
  // your code here
  return str.replace(/./g, (ch) => {
    if (/[aeiou]/.test(ch)) {
      return ch.toUpperCase();
    } else if (/[AEIOU]/.test(ch)) {
      return ch.toLowerCase();
    } else {
      return ch;
    }
  });
}
