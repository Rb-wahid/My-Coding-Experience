function test(r, g, b) {
  r = r.toString(16);
  g = g.toString(16);
  b = b.toString(16);

  return (
    (r.length === 1 ? "0" + r : r) +
    (g.length === 1 ? "0" + g : g) +
    (b.length === 1 ? "0" + b : b)
  );
}

let r = 0;
let g = 0;
let b = 0;

console.log(test(148, 0, 211));