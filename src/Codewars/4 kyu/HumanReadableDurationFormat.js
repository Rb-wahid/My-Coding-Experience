function formatDuration(seconds) {
  // Complete this function
  let t = seconds;
  let str = [];

  while (t !== 0) {
    if (t >= 31536000) {
      m = parseInt(t / 31536000);
      s = m > 1 ? "years" : "year";
      str.push(`${m} ${s}`);
      t -= 31536000 * m;
    } else if (t >= 86400) {
      m = parseInt(t / 86400);
      s = m > 1 ? "days" : "day";
      str.push(`${m} ${s}`);
      t -= 86400 * m;
    } else if (t >= 3600) {
      m = parseInt(t / 3600);
      s = m > 1 ? "hours" : "hour";
      str.push(`${m} ${s}`);
      t -= 3600 * m;
    } else if (t >= 60) {
      m = parseInt(t / 60);
      s = m > 1 ? "minutes" : "minute";
      str.push(`${m} ${s}`);
      t -= 60 * m;
    } else if (t > 0) {
      s = t > 1 ? "seconds" : "second";
      str.push(`${t} ${s}`);
      t = 0;
    }
  }
    let last = str.pop();
  return str.join(", ") + ` and ${last}`;
}

console.log(formatDuration(91536001));
