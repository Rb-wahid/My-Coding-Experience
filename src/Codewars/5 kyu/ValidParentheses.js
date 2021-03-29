function validParentheses(parens) {
  //TODO
    let first = parens.match(/\(/g);
    let second = parens.match(/\)/g);

    return first && second ? first.length === second.length : false;
}

console.log(validParentheses(""));