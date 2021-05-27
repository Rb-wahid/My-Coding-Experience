function timeForMilkAndCookies(date) {
  //TODO
  return date.getMonth() === 11 && date.getDate() === 24;
}

console.log(timeForMilkAndCookies(new Date(2013, 11, 24)));
