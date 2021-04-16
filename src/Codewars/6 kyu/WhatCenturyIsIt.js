function whatCentury(year) {
  // code must go here
  let century = Math.ceil(year / 100);
  let arr = ["st", "nd", "rd"];
  let num = [1, 2, 3];
  let last = century % 10;
  return num.includes(last) ? `${century}${arr[last - 1]}` : `${century}th`;
}

console.log(whatCentury(2014));
