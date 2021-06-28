function nouveau(Constructor, ...args) {
  const thisValue = Object.create(Constructor.prototype);
  const result = Constructor.apply(thisValue, args);

  return (typeof result === "object" || typeof result === "function") &&
    result !== null
    ? result
    : thisValue;
}
