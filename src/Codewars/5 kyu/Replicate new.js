function nouveau(Constructor, ...args) {
  const thisValue = Object.create(Constructor.prototype);
  const result = Constructor.apply(thisValue, args);

  return result === Object(result) ? result : thisValue;
}
