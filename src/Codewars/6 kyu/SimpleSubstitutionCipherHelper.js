function SubstitutionCipher(abc1, abc2) {
  this.opration = function (str, encode, decode) {
    return [...str]
      .map((ch) => {
        let encodeIndex = encode.indexOf(ch);
        if (encodeIndex == -1) {
          return ch;
        }
        let decodeValue = decode[encodeIndex];
        return decodeValue;
      })
      .join("");
  };

  this.encode = function (str) {
    //...
    return this.opration(str, abc1, abc2);
  };
  this.decode = function (str) {
    //...
    return this.opration(str, abc2, abc1);
  };
}

var abc1 = "abcdefghijklmnopqrstuvwxyz";
var abc2 = "etaoinshrdlucmfwypvbgkjqxz";

var sub = new SubstitutionCipher(abc1, abc2);
console.log(sub.encode("abc")); // => "eta"
console.log(sub.encode("xyz")); // => "qxz"

console.log(sub.decode("qxz")); // => "xyz"
console.log(sub.decode("eirfg")); // => "aeiou"
