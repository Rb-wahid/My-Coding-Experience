var generateColor = function () {
  // show em the code!
  const random = () => Math.floor(Math.random() * 16);
  let loop = 0;
  let str = "#";
  while (loop++ < 6) {
    str += random().toString(16);
  }
  return str.toUpperCase();
};

generateColor();
