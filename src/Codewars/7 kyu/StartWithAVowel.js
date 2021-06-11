function vowelStart(str) {
  //write your code here
  return str
    .replace(/\s/g, "")
    .toLowerCase()
    .replace(/[aeiou]/g, (el) => " " + el);
}

console.log(vowelStart("Coding is great"));
