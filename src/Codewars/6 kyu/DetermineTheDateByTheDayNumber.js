function getDay(day, isLeap) {
  let baseDate = new Date((isLeap ? "2020" : "2021") + "/01/01");
  baseDate.setDate(baseDate.getDate() + day - 1);
  return baseDate.toLocaleString('en', { month: 'long' }) + ", " + baseDate.getDate();
}

console.log(getDay(59, false));
