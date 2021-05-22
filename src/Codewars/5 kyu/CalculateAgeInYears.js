function getAge(birthDate, nowDate) {
  if (!nowDate) {
    nowDate = new Date();
  }
  let dayInYear =
    nowDate.getDate() === 28 && nowDate.getMonth() === 1 ? 366 : 365;
  return parseInt((nowDate - birthDate) / dayInYear / 86400000);
}

console.log(getAge(new Date("2008/02/29")));
