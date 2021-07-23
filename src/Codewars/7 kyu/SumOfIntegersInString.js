function sumOfIntegersInString(s) {
  let digit = s.replace(/\D/g, ' ');
  console.log(digit, s);
  return digit.split(" ").reduce((a, b) => a + Number(b), 0); // what the function name says
}

console.log(sumOfIntegersInString("12.4"));