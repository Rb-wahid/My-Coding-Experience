function alphabetPosition(text) {
  return text
    .toLowerCase()
    .match(/[a-z]/g)
    .map((c) => c.charCodeAt() - 96)
    .join(" ");
}

let text = "The sunset sets at twelve o' clock.";

console.log(alphabetPosition(text));