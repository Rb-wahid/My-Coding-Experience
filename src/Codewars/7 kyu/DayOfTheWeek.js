function getDayOfTheWeek(date) {
  let week = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];
  let dow = new Date(date).getDay();

  return week[dow];
}
