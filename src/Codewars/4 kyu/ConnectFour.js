function whoIsWinner(piecesPositionList) {
  //return "Red", "Yellow" or "Draw"
  let y = piecesPositionList.join``.match(/yellow/gi);
  let r = piecesPositionList.join``.match(/red/gi);

  return y.length == r.length ? "Draw" : y.length > r.length ? "Yellow" : "Red";
}

console.log(
  whoIsWinner([
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "A_Red",
    "B_Yellow",
    "G_Red",
    "B_Yellow",
  ])
);
