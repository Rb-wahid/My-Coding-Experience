function validParentheses(parens) {
  //TODO
    let first = parens.match(/\(/g);
    let second = parens.match(/\)/g);

    return first.length === second.length;
}

console.log(validParentheses("(())(()())())"));