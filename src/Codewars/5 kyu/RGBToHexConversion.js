function test(r, g, b) {
  r = valid(r);
  g = valid(g);
  b = valid(b);

  return toHex(r) + toHex(g) + toHex(b);
}

function toHex(r) {
  r = r.toString(16).toUpperCase();
  return r.length === 1 ? "0" + r : r;
}

function valid(r) {
  if (r > 255) return 255;
  if (r < 0) return 0;
  return r;
}

console.log(test(300, 255, 255));
