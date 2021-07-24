function totalTime(arr) {
  // your solution...
  const validPlural = (digit, str) =>
    digit == 1 ? `${digit} ${str}` : digit == 0 ? "" : `${digit} ${str}s`;
  let seconds = 0;
  let day = (hour = minute = 0);
  arr.forEach((t) => {
    t = t
      .split(":")
      .reverse()
      .map((el) => Number(el));
    seconds += t[0] + (t[1] || 0) * 60 + (t[2] || 0) * 3600;
  });

  if (seconds >= 86400) {
    day = parseInt(seconds / 86400);
    seconds = seconds % 86400;
  }
  if (seconds >= 3600) {
    hour = parseInt(seconds / 3600);
    seconds = seconds % 3600;
  }
  if (seconds >= 60) {
    minute = parseInt(seconds / 60);
    seconds = seconds % 60;
  }
  seconds = seconds == 0 ? "" : seconds;
  console.log(seconds);

  return !(day > 0 || hour > 0 || minute > 0 || seconds > 0)
    ? "0"
    : [
        validPlural(day, "day"),
        validPlural(hour, "hour"),
        validPlural(minute, "minute"),
        validPlural(seconds, "second"),
      ]
        .filter((el) => el != "")
        .join(", ");
}

console.log(totalTime(["24:00:00", "24:00:00", "07"]));
