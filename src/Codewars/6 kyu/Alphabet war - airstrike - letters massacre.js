function alphabetWar(fight) {
  fight = [...fight];
  let obj = {
    w: 4,
    p: 3,
    b: 2,
    s: 1,
    m: -4,
    q: -3,
    d: -2,
    z: -1,
  };

  let arr = [];

  for (let i = 0; i < fight.length; i++) {
    if (fight[i - 1] !== "*" && fight[i] !== "*" && fight[i + 1] !== "*") {
      arr.push(fight[i]);
    }
  }

  let ans = arr.reduce((sum, ch) => sum + (obj[ch] ? obj[ch] : 0), 0);

  if (ans > 0) {
    return "Left side wins!";
  } else if (ans < 0) {
    return "Right side wins!";
  } else return "Let's fight again!";
}
