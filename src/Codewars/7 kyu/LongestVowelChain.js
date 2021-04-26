function solve(s) {
  let regex = /[aeiou]+/;
  let max = Number.MIN_SAFE_INTEGER;
  let len;

  do {
    len = s.length;
    s = s.replace(regex, "");
    max = Math.max(max, len - s.length);
  } while (regex.test(s));
  return max;
}

console.log(solve("iiihoovaeaaaoougjyaw"));
