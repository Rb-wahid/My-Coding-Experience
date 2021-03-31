function duplicateEncode(word) {
  // ...
  return word
    .toLowerCase()
    .split("")
    .map((value, index, array) =>
      array.indexOf(value) === array.lastIndexOf(value) ? "(" : ")"
    ).join("");
}

console.log(duplicateEncode("Success"));
