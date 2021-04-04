function goodVsEvil(good, evil) {
  good = good.split(" ");
  evil = evil.split(" ");
  let result = 0;

  good.map((a) => (result += Number(a)));
  evil.map((a) => (result -= Number(a)));

  if (result === 0) {
    return "Battle Result: No victor on this battle field";
  } else if (result > 0) {
    return "Battle Result: Good triumphs over Evil";
  } else {
    return "Battle Result: Evil eradicates all trace of Good";
  }
}

console.log(goodVsEvil("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
