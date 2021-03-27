function test(r, g, b) {
  r = r.toString(16).toUpperCase();
  if (parseInt(r) < 0) r = "0";
  g = g.toString(16).toUpperCase();
  if (parseInt(g) < 0) g = "0";
  b = b.toString(16).toUpperCase();
  if (parseInt(b) < 0) b = "0";

  return (
    (r.length === 1 ? "0" + r : r) +
    (g.length === 1 ? "0" + g : g) +
    (b.length === 1 ? "0" + b : b)
  );
}

let r = 0;
let g = 0;
let b = 0;

console.log(test(0, 0, -20));
