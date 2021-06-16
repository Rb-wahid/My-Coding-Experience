function bangN(n, history) {
  return (history.match(new RegExp(`${n} +(.+)`)) || [
    ,
    `!${n}: event not found`,
  ])[1];
}
let history =
  "   1  cd /pub\n  2  more beer\n  3  lost\n  4  ls\n  5  touch me \n  6  chmod 000 me \n  7  more me\n  8  history";
console.log(bangN(67, history));
