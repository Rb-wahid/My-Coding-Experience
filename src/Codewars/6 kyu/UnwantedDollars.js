function money_value(s) {
  let number = parseFloat(s);
  if (!number) {
    number = s.replace(/[\$\s]/g, "");
    number = parseFloat(number);
    if (!number) return "0.0";
  }

  number = /\./.test(number.toString()) ? number : number + ".0";
  return number;
}

console.log(money_value("-$  $"));
// Test.expect(close_enough(money_value("-$ 0.1"), -0.1));
// Test.expect(close_enough(money_value("$-2.3456"), -2.3456));
// Test.expect(close_enough(money_value("$$$"), 0.0));
