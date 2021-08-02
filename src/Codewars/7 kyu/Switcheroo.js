function switcheroo(x) {
  return x.replace(/[ab]/g, (s) => (s == "a" ? "b" : "a"));
}
