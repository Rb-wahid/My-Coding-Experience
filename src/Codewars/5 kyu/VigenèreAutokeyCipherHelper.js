function VigenèreCipher(key, abc) {
  let keyIndices = [...key].map((ch) => abc.indexOf(ch));

  const op = (str, mode) => {
    let fullKey = keyIndices.slice();
    return [...str]
      .map((ch) => {
        let chIndex = abc.indexOf(ch);

        if (chIndex == -1) {
          return ch;
        }

        let keyIndex = fullKey.shift();
        let newKey;

        if (mode == "encode") {
          newKey = (chIndex + keyIndex) % abc.length;
          fullKey.push(chIndex);
        } else {
          newKey = (chIndex - keyIndex + abc.length) % abc.length;
          fullKey.push(newKey);
        }
        return abc[newKey];
      })
      .join("");
  };

  this.encode = function (str) {
    //...
    return op(str, "encode");
  };
  this.decode = function (str) {
    //...
    return op(str);
  };
}

