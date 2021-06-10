function convertBits(a, b) {
  a = a.toString(2).split``;
  b = b.toString(2).split``;

  let diff = 0;
  let maxLen = Math.max(a.length, b.length);
  for (let i = 0; i < maxLen; i++) {
    if (a[i] !== b[i]) diff++;
  }

  return diff;
}

console.log(convertBits(31, 14));
