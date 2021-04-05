function goodVsEvil(good, evil) {
  good = good.split(" ");
  evil = evil.split(" ");
  let gPoint =
    good[0] * 1 +
    good[1] * 2 +
    good[2] * 3 +
    good[3] * 3 +
    good[4] * 4 +
    good[5] * 10;
  let ePoint =
    evil[0] * 1 +
    evil[1] * 2 +
    evil[2] * 2 +
    evil[3] * 2 +
    evil[4] * 3 +
    evil[5] * 5 +
    evil[6] * 10;

  if (gPoint === ePoint) {
    return "Battle Result: No victor on this battle field";
  } else if (gPoint > ePoint) {
    return "Battle Result: Good triumphs over Evil";
  } else {
    return "Battle Result: Evil eradicates all trace of Good";
  }
}

console.log(goodVsEvil("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
