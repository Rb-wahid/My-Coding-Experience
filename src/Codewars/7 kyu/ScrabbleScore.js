function scrabbleScore(str) {
  // ...
  str = str.toUpperCase();
  let one = ["A", "E", "I", "O", "U", "L", "N", "R", "S", "T"];
  let two = ["D", "G"];
  let three = ["B", "C", "M", "P"];
  let four = ["F", "H", "V", "W", "Y"];
  let five = ["K"];
  let eight = ["J", "X"];
  let ten = ["Q", "Z"];
  let sum = 0;

  for (const el of str) {
    if (one.includes(el)) sum += 1;
    else if (two.includes(el)) sum += 2;
    else if (three.includes(el)) sum += 3;
    else if (four.includes(el)) sum += 4;
    else if (five.includes(el)) sum += 5;
    else if (eight.includes(el)) sum += 8;
    else if (ten.includes(el)) sum += 10;
  }

  return sum;
}

console.log(scrabbleScore("cabbage"));
