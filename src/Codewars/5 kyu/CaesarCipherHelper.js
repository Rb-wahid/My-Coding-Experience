var CaesarCipher = function (shift) {
  // TODO: Complete the CaesarCipher object
  this.encode = function (str) {
    str = str.toUpperCase();
    return [...str]
      .map((el) => {
        let code = el.charCodeAt();
        if (code >= 65 && code <= 90) {
          code = ((code + shift - 64) % 26) + 64;
          let value = String.fromCharCode(code);
          return value;
        } else {
          return el;
        }
      })
      .join("");
  };

  this.decode = function (str) {
    str = str.toUpperCase();
    return [...str]
      .map((el) => {
        let code = el.charCodeAt();
        if (code >= 65 && code <= 90) {
          code = code - shift;
          code = code < 65 ? 91 - (65 - code) : code;
          let value = String.fromCharCode(code);
          return value;
        } else {
          return el;
        }
      })
      .join("");
  };
};

var c = new CaesarCipher(5); // creates a CipherHelper with a shift of five
console.log(c.encode("Codewars")); // returns 'HTIJBFWX'
console.log(c.decode("BFKKQJX")); // returns 'WAFFLES'
