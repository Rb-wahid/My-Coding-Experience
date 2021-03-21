function firstNonRepeatingLetter(s) {
  // Add your code here
  let str = s.toLowerCase();
  let flag = false;

  for (let i = 0; i < s.length; i++) {
    flag = true;
    for (let j = 0; j < s.length; j++) {
      if (i !== j && s.charAt(i).toLowerCase() === s.charAt(j).toLowerCase()) {
        flag = false;
        break;
      }
    }
    if (flag) {
      return s.charAt(i);
    }
  }
  return "";
}

let s = "a";

console.log(firstNonRepeatingLetter(s));
