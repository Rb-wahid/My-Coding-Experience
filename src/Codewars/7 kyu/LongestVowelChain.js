function solve(s) {
  let regex = /[^aeiou]+/;
  return Math.max(...s.split(regex).map((a) => a.length));
}

console.log(solve("iiihoovaeaaaoougjyaw"));
