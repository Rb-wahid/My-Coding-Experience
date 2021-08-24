function makeClass(...properties) {
  //
  return function (...args) {
    return properties.forEach((prop, i) => (this[prop] = args[i]));
  };
}
