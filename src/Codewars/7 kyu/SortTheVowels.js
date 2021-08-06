function sortVowels(s) {
  //code
  if (s == false || typeof s != "string") {
    return "";
  }
  let isV = (ch) => /[aeiou]/i.test(ch);
  return [...s].map((el) => (isV(el) ? "|" + el : el + "|")).join("\n");
}

console.log(sortVowels("Rnd Te5T"));
