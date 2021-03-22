function incrementString(strng) {
  // return incrementedString
  let string = strng.replace(/[0-9]/g, "");
  let len = strng.length - string.length;
  let str = strng.slice(string.length) || "0";
  str = (parseInt(str) + 1).toString();

  while (str.length < len) {
    str = "0" + str;
  }

  return string.concat(str);
}

let strng = "fodfgdfgduo00";

console.log(incrementString(strng));
