function prettyTimeFormat(seconds) {
  // your code here

  h = parseInt(seconds / 3600);
  seconds = seconds % 3600;
  m = parseInt(seconds / 60);
  seconds = parseInt(seconds % 60);
  if (h) m = ":" + ("0" + m).slice(-2);
  if (m) seconds = ":" + ("0" + seconds).slice(-2);
  return `${h > 0 ? h : ""}${m === 0 ? "" : m}${seconds}`;
}

console.log(prettyTimeFormat(14989));
