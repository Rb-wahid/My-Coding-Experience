function lastDayIsFriday(initialYear, endYear) {
  let count = 0;
  let date = new Date();

  for (let i = initialYear; i <= endYear; ) {
    for (let m = 1; m <= 12; m++) {
      date.setFullYear(i, m, 0);
      if (date.getDay() === 5) count++;
    }
    i++;
    date.setFullYear(i);
  }
  return count;
}

console.log(lastDayIsFriday(1990, 2000));
