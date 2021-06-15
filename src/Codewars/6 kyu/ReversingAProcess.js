function decode(r) {
  // your code
  let d = r.match(/\d/g).join``;
  let t = r.match(/[a-z]/g);
  let k;
  let ans = "";
  for (const el of t) {
    k = el.charCodeAt() - 97;
    for (let i = 0; i < 26; i++) {
      if ((d * i) % 26 === k) {
        ans += String.fromCharCode(i + 97);
      }
    }
  }

  return ans.length === t.length ? ans : "Impossible to decode";
}

console.log(decode("5057aan"));
