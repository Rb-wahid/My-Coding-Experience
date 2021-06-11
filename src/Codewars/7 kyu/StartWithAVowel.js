function vowelStart(str) {
  //write your code here
  return str
    .toLowerCase()
    .replace(/[\W\s_]/g, "")
    .replace(/[aeiou]/g, " $&")
    .trim();
}

console.log(vowelStart("Coding is great"));
