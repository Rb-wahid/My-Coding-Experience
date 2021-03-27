function rgb(r, g, b) {
  return toHex(r) + toHex(g) + toHex(b);
}

function toHex(r) {
  if (r > 255) return "FF";
  if (r < 0) return "00";
  return ("0" + Number(r).toString(16)).slice(-2).toUpperCase();
}

console.log(rgb(300, -255, 255));
