function getAge(birthDate, nowDate) {
  nowDate = nowDate || new Date();

  let year = nowDate.getFullYear() - birthDate.getFullYear();

  return nowDate.getMonth() < birthDate.getMonth() ||
    (nowDate.getMonth() == birthDate.getMonth() &&
      nowDate.getDate() < birthDate.getDate())
    ? --year
    : year;
}

console.log(getAge(new Date("2008/02/29")));
