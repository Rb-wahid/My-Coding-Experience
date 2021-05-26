function decypher(string) {
  // do your magic here
  let upperCase = {
    1: "I",
    2: "R",
    3: "E",
    4: "A",
    5: "S",
    6: "G",
    7: "T",
    8: "B",
    9: " ",
    0: "O",
  };

  let lowerCase = {
    1: "l",
    2: "z",
    3: "e",
    4: "a",
    5: "s",
    6: "b",
    7: "t",
    8: " ",
    9: "g",
    0: "o",
  };

  let ans = "";
  string = string.split(". ");
  for (let j = 0; j < string.length; j++) {
    console.log(string[j]);
    str = string[j].split``;

    for (let i = 0; i < str.length; i++) {
      if (i === 0 && upperCase[str[i]]) {
        str[i] = upperCase[str[i]];
      }
      if (str[i] === "1" && isIUpp(str, i)) {
        str[i] = upperCase[str[i]];
      } else if (lowerCase[str[i]]) {
        str[i] = lowerCase[str[i]];
      }
    }
    if (string.length - 1 > j) str.push(". ");
    ans += str.join``;
  }
    return ans;
}

function isIUpp(str, i) {
  let len = str.length - 1;
 // if (i === len) return true;
   if (str[i - 1] === " " && str[i + 1] === " ") return true;
  else false;
}

decypher("1 d0 n07 kn0w wh47 3153 1 c4n 7357. 83 c001. 600d 1uck");
