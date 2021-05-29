function getDay(day, isLeap) {
  let month = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December",
  ];
  let m, d;
  let dom = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334];
  let domLeap = [0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335];
  for (let i = 0; i < dom.length - 1; i++) {
    if (isLeap) {
      if (domLeap[i] <= day && domLeap[i + 1] > day) {
        m = month[i];
        d = day - domLeap[i];
        console.log(m, d);
      }
    } else {
      if (dom[i] <= day && dom[i + 1] > day) {
        m = month[i];
        d = day - dom[i];
      }
    }
  }
  if (!m) {
    m = "December";

    d = isLeap ? day - 335 : day - 334;
  }
    return `${m}, ${d}`;
}

console.log(getDay(366, true));
