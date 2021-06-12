function blackFriday(year) {
  let i = 2;
  let count = 0;
  let date = new Date(year, 10, i);
  while (count != 4) {
    date.setDate(i);
    if (date.getDay() === 5) {
      count++;
    }
    i++;
  }
  return date.getDate();
}

console.log(blackFriday(2013));
