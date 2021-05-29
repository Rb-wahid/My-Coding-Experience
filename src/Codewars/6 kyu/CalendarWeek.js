function getCalendarWeek(date) {
  let dateObj = new Date(date);

  // ... calculate calendar week
  let dom = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334];
  let dow = dateObj.getDay();
  let doy = dom[dateObj.getMonth()] + dateObj.getDate();
  console.log(doy);
    console.log(doy , dow);
    let ans = (10 + (doy - dow))/7;
   return parseInt(ans);
}
console.log(getCalendarWeek("2017-02-08"));
