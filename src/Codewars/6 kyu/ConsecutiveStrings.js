function longestConsec(strarr, k) {
  // your code
  let n = strarr.length;
  if (n === 0 || k > n || k <= 0) return "";
  let arr = [];
  let longStr = "";

  for (let index = 0; index < strarr.length; index++) {
    arr = strarr.slice(index, index + k);

    if (arr.join("").length > longStr.length) longStr = arr.join("");
  }
  return longStr;
}

let strarr = [
  "ejjjjmmtthh",
  "zxxuueeg",
  "aanlljrrrxx",
  "dqqqaaabbb",
  "oocccffuucccjjjkkkjyyyeehh",
];

console.log(longestConsec(strarr, 1));
