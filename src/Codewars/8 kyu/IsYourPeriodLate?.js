function periodIsLate(last, today, cycleLength) {
  let date = Math.abs(today - last) / (24 * 60 * 60 * 1000);
  return date > cycleLength;
}

