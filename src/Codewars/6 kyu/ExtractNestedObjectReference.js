Object.prototype.hash = function (string) {
  let object = { ...this };
  let keys = string.split(".");
  return keys.reduce((obj, property) => (obj ? obj[property] : obj), object);
};
