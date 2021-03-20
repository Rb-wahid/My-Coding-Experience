function alphabetPosition(text) {
  text = text.toLowerCase().match(/[a-z]/g);
  return text ? text.map((c) => c.charCodeAt() - 96).join(" ") : "";
}

let text = "The sunset sets at twelve o' clock.";

console.log(alphabetPosition(text));