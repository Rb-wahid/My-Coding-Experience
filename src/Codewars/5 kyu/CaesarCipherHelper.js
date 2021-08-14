var CaesarCipher = function (shift) {
  // TODO: Complete the CaesarCipher object
  const op = (str, shift) => {
    return str.toUpperCase().replace(/[A-Z]/g, (ch) => {
      let code = 65 + ((ch.charCodeAt() + shift - 65) % 26);
      return String.fromCharCode(code);
    });
  };
  this.encode = function (str) {
    return op(str, shift);
  };

  this.decode = function (str) {
    shift = 26 - shift;
    return op(str, shift);
  };
};

var c = new CaesarCipher(5); // creates a CipherHelper with a shift of five
console.log(c.encode("Codewars")); // returns 'HTIJBFWX'
console.log(c.decode("BFKKQJX")); // returns 'WAFFLES'
