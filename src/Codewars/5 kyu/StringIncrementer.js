function incrementString(strng) {
  // return incrementedString
  let digit = strng.match(/[1-9]/gi);
    if (digit) {
    digit = digit.join("");
    let len = strng.length - digit.length;
    digit = parseInt(digit) + 1;
    return strng.substring(0, len) + digit;
  } else {
    return strng.match(/[0]/gi) ? strng.substring(0,strng.length - 1) + "1" : strng + 1;
  }
}

let strng = "foo000";

console.log(incrementString(strng));
