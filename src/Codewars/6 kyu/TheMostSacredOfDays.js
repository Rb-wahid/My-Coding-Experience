function blackFriday(year) {
  return 30 - (new Date(year, 11, 1).getDay() + 1);
}

console.log(blackFriday(2013));
