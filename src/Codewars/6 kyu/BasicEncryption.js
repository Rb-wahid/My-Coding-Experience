function encrypt(text, rule) {
  let ans = "";
  let k = 0;
  for (let i = 0; i < text.length; i++) {
    k = text.charCodeAt(i) + rule;
    while (k > 255) k = k - 256;
    ans += String.fromCharCode(k);
  }
  return ans;
}

console.log(encrypt("please encrypt me", 2));
