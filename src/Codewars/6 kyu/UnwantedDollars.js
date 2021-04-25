function money_value(s) {
  return +s.replace(/[\s\$]/g, "") || 0;
}

console.log(money_value("-$ 5435 $"));
