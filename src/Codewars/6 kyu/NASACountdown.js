function countdown(ms) {
  // TODO ...
  let isNeg = false;
  if (0 > ms) {
    isNeg = true;
    ms *= -1;
  }

  let seconds = ms / 1000;
  let hours = parseInt(seconds / 3600);
  seconds %= 3600;
  let minutes = parseInt(seconds / 60);
  seconds %= 60;
  console.log(hours, minutes, seconds);
  return `${isNeg ? "-" : "+"}${hours < 10 ? "0" + hours : hours}:${
    minutes < 10 ? "0" + minutes : minutes
  }:${seconds < 10 ? "0" + seconds : seconds}`;
}

console.log(countdown(-154800000));
