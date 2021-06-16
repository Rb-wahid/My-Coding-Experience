function bangN(n, history) {
  history = history.split("\n").map((a) => a.replace(/[\d]/g, "").trim());
  return history[n - 1] ? history[n - 1] : `!${n}: event not found`;
}

let history =
  "   1  cd /pub\n  2  more beer\n  3  lost\n  4  ls\n  5  touch me \n  6  chmod 000 me \n  7  more me\n  8  history";
console.log(bangN(12, history));
