function isJubilee(year) {
    let date = new Date(year + "/07/25");
  return date.getDay() === 0; // Hey, this works for 86% of the cases ;-)
}

console.log(isJubilee(2021));