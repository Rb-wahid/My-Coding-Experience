function countdown(ms) {
  // TODO ...

  let seconds = Math.abs(ms) / 1000;
  let hours = parseInt(seconds / 3600);
  seconds %= 3600;
  let minutes = parseInt(seconds / 60);
  seconds %= 60;

  return `${ms < 0 ? "-" : "+"}${[hours, minutes, seconds]
    .map((el) => (el < 10 ? "0" + el : el))
    .join(":")}`;
}

console.log(countdown(-154800000));
