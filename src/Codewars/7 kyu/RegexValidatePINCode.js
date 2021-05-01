function validatePIN(pin) {
  //return true or false
  let isAllDigit = !/\D+/g.test(pin);
  if (isAllDigit) {
    return pin.length === 6 || pin.length === 4;
  }
  return isAllDigit;
}

console.log(validatePIN(".134"));
