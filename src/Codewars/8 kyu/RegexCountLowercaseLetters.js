function lowercaseCount(str) {
  //How many?
  return str.replace(/[^a-z]/g, "").length;
}

console.log(lowercaseCount("abcABC123"));
