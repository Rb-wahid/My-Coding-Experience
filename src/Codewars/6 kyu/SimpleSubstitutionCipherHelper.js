function SubstitutionCipher(abc1, abc2) {
  this.encode = function (str) {
    //...
    return [...str]
      .map((ch) => {
        let encodeIndex = abc1.indexOf(ch);
        let decodeValue = abc2[encodeIndex];
        return decodeValue;
      })
      .join("");
  };
  this.decode = function (str) {
    //...
    return [...str]
      .map((ch) => {
        let decodeIndex = abc2.indexOf(ch);
        let encodeValue = abc1[decodeIndex];
        return encodeValue;
      })
      .join("");
  };
}



var abc1 = "abcdefghijklmnopqrstuvwxyz";
var abc2 = "etaoinshrdlucmfwypvbgkjqxz";

var sub = new SubstitutionCipher(abc1, abc2);
console.log(sub.encode("abc")); // => "eta"
console.log(sub.encode("xyz")); // => "qxz"

console.log(sub.decode("qxz")); // => "xyz"
console.log(sub.decode("eirfg")); // => "aeiou"
