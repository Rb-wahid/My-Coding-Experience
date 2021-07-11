var generateColor = function () {
  // show em the code!
  return `#${Math.random().toString(16).slice(-6).toUpperCase()}`;
};

console.log(generateColor());
