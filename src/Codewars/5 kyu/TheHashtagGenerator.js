function generateHashtag(str) {
  str = str.trim();
  let arr = str.split(" ");
  let ans = "#";

  for (let i = 0; i < arr.length; i++) {
    ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
  }
  return str && ans.length <= 140 ? ans : false;
}

let text = " Hello there thanks for trying my Kata";

console.log(generateHashtag(text));
