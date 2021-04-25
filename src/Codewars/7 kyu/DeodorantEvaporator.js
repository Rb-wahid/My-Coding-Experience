function evaporator(content, evap_per_day, threshold) {
  let day = 0;
  let p = 100;
  while (p > threshold) {
    day++;
    p -= p * (evap_per_day / 100);
  }
  return day;
}

console.log(evaporator(10, 10, 10));
