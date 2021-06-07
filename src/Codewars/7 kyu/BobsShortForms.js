function shortForm(str) {
  // do something
  let reg = /\B[aeiou]+\B/gi;
  return str.replace(reg, "");
}

console.log(shortForm("assault"));
