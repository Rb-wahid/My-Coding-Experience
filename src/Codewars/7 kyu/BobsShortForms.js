function shortForm(str) {
  // do something

  let reg = /[aeiou]+/gi;
  return (
    str.substring(0, 1) +
    str.substring(1, str.length - 1).replace(reg, "") +
    str.slice(-1)
  );
}

console.log(shortForm("assault"));
