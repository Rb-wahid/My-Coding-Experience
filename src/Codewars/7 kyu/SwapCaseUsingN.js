function swap(s, n) {
  n = n.toString(2).split``;
  s = s.split``;
  let len = n.length - 1;
  let k = 0;
  let isAlpha = (s) => /\w/i.test(s);
  let swap = (s) => (/[A-Z]/.test(s) ? s.toLowerCase() : s.toUpperCase());
  for (let i = 0; i < s.length; i++) {
    if (k > len) k = 0;
    if (isAlpha(s[i])) {
      s[i] = Number(n[k]) ? swap(s[i]) : s[i];
      k++;
    }
  }
  return s.join``; //code me!
}

console.log(swap("Hello world!", 11));
