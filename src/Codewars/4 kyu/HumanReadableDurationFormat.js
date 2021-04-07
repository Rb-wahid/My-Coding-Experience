function formatDuration(seconds) {
  if (seconds === 0) return "now";
  let time = {
    year: 31536000,
    day: 86400,
    hour: 3600,
    minute: 60,
    second: 1,
  };
  let arr = [];

  for (const key in time) {
    if (seconds >= time[key]) {
      value = parseInt(seconds / time[key]);
      value += value > 1 ? ` ${key}s` : ` ${key}`;
      arr.push(value);
      seconds %= time[key];
    }
  }
  let last = arr.pop();
  return arr.length >= 1 ? arr.join(", ") + ` and ${last}` : last;
}

console.log(formatDuration(62));
