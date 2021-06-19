function generateName() {
  // make sure to check the name is unique via the photoManager object
  return Math.random()
    .toString(36)
    .replace(/[\s\d]+/g, "")
    .slice(-6)
    .toUpperCase();
}
