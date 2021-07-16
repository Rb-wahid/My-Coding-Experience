function rot(strng) {
  // your code
  return [...strng].reverse().join("");
}
function selfieAndRot(strng) {
  // your code

  let str1 = strng
    .split("\n")
    .map((str) => str.padEnd(str.length * 2, "."))
    .join("\n");

  str1 += "\n" + rot(str1);
  return str1;
}
function oper(fct, s) {
  // your code
  return fct(s);
}
