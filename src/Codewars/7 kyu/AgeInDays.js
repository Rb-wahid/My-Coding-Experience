function ageInDays(year, month, day) {
  let today = new Date();
  let birthday = new Date(year, month - 1, day);

  let d = parseInt((today - birthday) / 86400000);
  return `You are ${d} days old`;
}

console.log(ageInDays(2021, 5, 25));
