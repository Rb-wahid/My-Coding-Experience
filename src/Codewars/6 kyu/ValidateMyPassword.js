function validPass(password) {
  let isNumber = /\d/.test(password);
  let isLetter = /[a-z]/i.test(password);
  let isAlpha = /\w{3,20}/g.test(password);
    let isOnlyAlpha = !/\W/g.test(password);
    
  return isAlpha && isOnlyAlpha && isNumber && isLetter ? "VALID" : "INVALID";
}

console.log(validPass("Username123-,"));
