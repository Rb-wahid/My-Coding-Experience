function minutesToMidnight(d) {
  //have fun with coding^.^
  let nextDay = new Date(d.getFullYear(), d.getMonth(), d.getDate() + 1);
  let m = Math.round((nextDay - d) / 60000);
  return `${m} ${m > 1 ? "minutes" : "minute"}`;
}

console.log(minutesToMidnight(new Date(new Date().setHours(0, 0, 0, 0))));
