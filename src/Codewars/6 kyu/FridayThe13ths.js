function fridayTheThirteenths(start, end) {
  end = end || start;
  let date = new Date(start, 0, 13);

  let ans = [];
  for (let year = start; year <= end; ) {
    for (let month = 1; month <= 12; month++) {
      date.setMonth(month - 1);
      if (date.getDay() === 5) {
        ans.push(`${month}/13/${year}`);
      }
    }
    year++;
    date.setFullYear(year);
  }
  return ans.join` `;
}

console.log(fridayTheThirteenths(1990, 1998));
