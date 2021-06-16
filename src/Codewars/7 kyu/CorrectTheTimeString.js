function timeCorrect(timestring) {
  const isNan = (a, b, c) => isNaN(a) || isNaN(b) || isNaN(c);
  let h = 0,
    m = 0,
    s = 0;
  if (!timestring) return timestring;
  if (/:/g.test(timestring)) {
    if (timestring.match(/:/g).length === 2) {
      [h, m, s] = timestring.split(":").map((a) => +a);
      m += parseInt(s / 60);
      h += parseInt(m / 60);
      h %= 24;
      m %= 60;
      s %= 60;
      return !isNan(h, m, s)
        ? `${("00" + h).slice(-2)}:${("00" + m).slice(-2)}:${("00" + s).slice(
            -2
          )}`
        : null;
    }
  }
  return null;
}

console.log(timeCorrect("09:11:01"));
