function scramble(str1, str2) {
  if (str1.length > str2.length) {
    return op(str2, str1);
  } else return op(str1, str2);
}

function op(low, high) {
  let flag;
  low = low.split("");
  high = high.split("");
  for (let i = 0; i < low.length; i++) {
    flag = false;
    for (let j = 0; j < high.length; j++) {
      if (low[i] === high[j]) {
        high[j] = null;
        flag = true;
        break;
      }
    }
    if (!flag) return false;
  }
  return true;
}

let str1 = "staek";
let str2 = "katas";

console.log(scramble(str1, str2));
