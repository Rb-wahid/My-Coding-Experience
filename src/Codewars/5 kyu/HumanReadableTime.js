function humanReadable(seconds) {
  // TODO
  const format = (num) => (num < 9 ? `0${num}` : num);
  let h = (m = s = 0);
  if (seconds >= 3600) {
    h = parseInt(seconds / 3600);
    seconds = seconds % 3600;
  }
  if (seconds >= 60) {
    m = parseInt(seconds / 60);
    seconds = seconds % 60;
  }
  s = seconds;

  return `${format(h)}:${format(m)}:${format(s)}`;
}
console.log(humanReadable(359999));
console.log(humanReadable(34));
