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
  for (let i = 0; i < dom.length; i++) {
    if (isLeap) {
      if (domLeap[i] < day ) {
        m = month[i];
        d = day - domLeap[i];
        console.log(m, d);
      }
    } else {
      if (dom[i] < day ) {
        m = month[i];
        d = day - dom[i];
      }
    }
  }
    return `${m}, ${d}`;
}

console.log(getDay(59, false));
