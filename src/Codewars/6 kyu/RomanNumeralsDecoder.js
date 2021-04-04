function solution(number) {
  let roman = {
    1000: "M",
    900: "CM",
    500: "D",
    400: "CD",
    100: "C",
    90: "XC",
    50: "L",
    40: "XL",
    10: "X",
    9: "IX",
    5: "V",
    4: "IV",
    1: "I",
  };
  let ans = 0;
  let len = number.length;

  for (let i = 0; i < len; i++) {
    for (const key in roman) {
      if (roman[key] === number[i]) {
        ans += Number(key);
        number[i] = "@";
        break;
      }
    }
  }
  return ans;
}
