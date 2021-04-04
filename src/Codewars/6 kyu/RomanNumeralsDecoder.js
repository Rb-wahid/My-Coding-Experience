function solution(roman) {
  const arr = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
  const romanArr = roman.split("");
  let ans = 0;
  for (let i = 0; i < romanArr.length; i++) {
    if (arr[romanArr[i]] < arr[romanArr[i + 1]]) {
      ans -= arr[romanArr[i]];
    } else ans += arr[romanArr[i]];
  }
  return ans;
}

console.log(solution("IV"));