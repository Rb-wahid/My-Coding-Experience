function solution(number) {
  let roman = {
    M: 1000,
    CM: 900,
    D: 500,
    CD: 400,
    C: 100,
    XC: 90,
    L: 50,
    XL: 40,
    X: 10,
    IX: 9,
    V: 5,
    IV: 4,
    I: 1,
  };
  let ans = "";

  while (number > 0) {
    for (const key in roman) {
      if (roman[key] <= number) {
        ans += key;
        number -= roman[key];
        break;
      }
    }
  }
    return ans;
}

console.log(solution(100));
