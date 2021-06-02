function findOutChristmasWeekday(date) {
  // your magic
  let week = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];
  let day = new Date(date).getDay();

  return week[day];
}
