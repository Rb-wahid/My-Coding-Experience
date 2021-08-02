function switcheroo(x) {
  return [...x].map((el) => (el == "a" ? "b" : el == "b" ? "a" : el)).join``;
}
