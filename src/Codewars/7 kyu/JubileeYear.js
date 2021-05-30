function isJubilee(year) {
  return new Date(year, 6, 25).getDay() === 0; // Hey, this works for 86% of the cases ;-)
}

console.log(isJubilee(2021));
