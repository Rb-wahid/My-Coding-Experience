function getAge(birthDate, nowDate) {
  const isLeapYear = (date) => (date.getDate() === 29 ? 366 : 365);

  if (!nowDate) nowDate = Date.now();
  return parseInt(
    (nowDate - birthDate) / `${isLeapYear(birthDate)}` / 86400000
  );
}

console.log(getAge(new Date("2008/02/29"), new Date("2009/02/28")));
