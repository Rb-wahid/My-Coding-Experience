const scramble = (str1, str2) =>
  [...str2].every((val) => str2.split(val).length <= str1.split(val).length);
  
let str1 = "dff";
let str2 = "df";

console.log(scramble(str1, str2));
