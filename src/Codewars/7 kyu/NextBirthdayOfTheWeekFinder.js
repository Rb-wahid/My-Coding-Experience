var nextBirthdayOfTheWeek = function (birthday) {
  let day = birthday.getDay();
  let y = birthday.getFullYear();
  let ans = 0;
  for (let i = y + 1; i <= 2021; i++) {
    birthday.setFullYear(i);
    if (birthday.getDay() === day) {
      ans = birthday.getFullYear() - y;
      return ans;
    }
  }
  return ans;
};

console.log(nextBirthdayOfTheWeek(new Date(1990, 10, 16)));
