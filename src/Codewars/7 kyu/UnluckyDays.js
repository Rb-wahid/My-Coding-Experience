function unluckyDays(year) {
  //your code here
    let date = new Date(year, 0, 13);
    let options = { weekday: 'long' };
    let dateTimeFormat = new Intl.DateTimeFormat("en-US", options);
    let week;
    let count = 0;

    for (let i = 0; i < 12; i++) {
        date.setMonth(i);
        week = dateTimeFormat.format(date);

        if (week === "Friday") {
            count++;
        }
    }
    return count;
}

console.log(unluckyDays(2015));
