function busTimer(time) {
  time = time.split(":");
  let hour = +time[0];
  let minute = +time[1] + 5;
  if (minute > 59) {
    minute = minute % 60;
    hour++;
  }
  if (hour > 23 && minute > 0) {
    hour = hour % 24;
  }

  hour = hour < 6 ? 5 - hour : "running";

  if (hour != "running") {
    minute = hour * 60 + (60 - minute);
    return minute;
  } else return minute % 15 > 0 ? 15 - (minute % 15) : minute % 15;
}

console.log(busTimer("23:56"));
