function compose(f, g) {
  // Compose the two functions here!
  return function (...x) {
    return f(g(...x));
  };
}
