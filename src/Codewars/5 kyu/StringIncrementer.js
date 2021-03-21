function incrementString(strng) {
  // return incrementedString
  let digit = strng.match(/[1-9]/gi);
  if (digit) {
    digit = digit.join("");
    let len = strng.length - digit.length;
    digit = parseInt(digit) + 1;
    return strng.substring(0, len) + digit;
  } else {
    return strng + "1";
  }
}

let strng = "foo";

console.log(incrementString(strng));
