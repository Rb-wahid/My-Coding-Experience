function groupByCommas(n) {
  const toReverse = (str) => [...str].reverse().join``;
  n = String(n);
  if (n.length <= 3) return n;

  n = toReverse(n).replace(/.../g, (el) => el + ",");
  return toReverse(n).replace(/^,/, '');
}

console.log(groupByCommas("100000"));
