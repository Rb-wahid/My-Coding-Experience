function nextHappyYear(year) {
  //your code here
  while (new Set([...(++year + "")]).size < 4) {}
  return year;
}

console.log(nextHappyYear(5555));
