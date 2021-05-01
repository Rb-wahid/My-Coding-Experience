function validatePIN(pin) {
  //return true or false
 return /^(\d{6}|\d{4})$/.test(pin);
}

console.log(validatePIN(".134"));
