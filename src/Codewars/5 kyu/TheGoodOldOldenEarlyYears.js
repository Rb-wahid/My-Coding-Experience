// Will always receive the date in dd-mm-yyyy format. i.e: 01-02-5
function getGoodOldDay(input) {
  // return day of week
  let week = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];
  let date = new Date();
  input = input.split`-`;
  let d = input[0];
  let m = input[1];
  let y = input[2];

  date.setFullYear(y);
  date.setMonth(m - 1);
  date.setDate(d);
  return week[date.getDay()];
}

console.log(getGoodOldDay("19-11-0017"));
