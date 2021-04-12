function runningPace(distance, time) {
  let t = time.split(":");
  let totalSeconds = Number(t[0]) * 60 + Number(t[1]);
  let ans = totalSeconds / distance;
  let minutes = Math.floor(ans / 60);
  let seconds = Math.floor(ans % 60);
  return `${minutes}:${seconds.toString().length === 1 ? `0${seconds}` : seconds}`;
}

console.log(runningPace(15, "75:80"));
