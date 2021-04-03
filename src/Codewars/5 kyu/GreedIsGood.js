function score(dice) {
  // Fill me in!
  dice.sort();
  let one = 0;
  let six = 0;
  let five = 0;
  let four = 0;
  let three = 0;
  let two = 0;
  let sum = 0;
  for (let i = 0; i < dice.length; i++) {
    switch (dice[i]) {
      case 1:
        one++;
        break;
      case 6:
        six++;
        break;

      case 5:
        five++;
        break;

      case 4:
        four++;
        break;

      case 3:
        three++;
        break;

      case 2:
        two++;
        break;
    }
  }

  if (one > 0) {
    while (one - 3 >= 0) {
      sum += 1000;
      one -= 3;
    }
    if (one > 0) sum += 100 * one;
  }

  if (six > 0) {
    while (six - 3 >= 0) {
      sum += 600;
      six -= 3;
    }
  }

  if (five > 0) {
    while (five - 3 >= 0) {
      sum += 500;
      five -= 3;
    }
    if (five > 0) sum += 50 * five;
  }

  if (four > 0) {
    while (four - 3 >= 0) {
      sum += 400;
      four -= 3;
    }
  }

  if (three > 0) {
    while (three - 3 >= 0) {
      sum += 300;
      three -= 3;
    }
  }

  if (two > 0) {
    while (two - 3 >= 0) {
      sum += 200;
      two -= 3;
    }
  }

  return sum;
}

console.log(score([5, 5, 5, 0, 3, 0, 3]));
