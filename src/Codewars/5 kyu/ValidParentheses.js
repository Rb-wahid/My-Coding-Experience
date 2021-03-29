function validParentheses(parens) {
  //TODO
  let regex = /\(\)/g;

  while (regex.test(parens)) {
    parens = parens.replace(regex, "");
  }
  return !parens;
}

console.log(validParentheses("()"));
