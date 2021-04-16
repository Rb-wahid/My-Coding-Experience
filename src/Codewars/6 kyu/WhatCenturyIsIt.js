function whatCentury(year) {
  // code must go here
  let century = Math.ceil(year / 100);
  let arr = ["st", "nd", "rd"];
  let incl = [1, 2, 3];
  let excl = [11, 12, 13];
  let last = century % 10;
  console.log(last);
  return incl.includes(last) && !excl.includes(century)
    ? `${century}${arr[last - 1]}`
    : `${century}th`;
}

console.log(whatCentury(1023));
