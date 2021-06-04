const decrypt = (str) => {
  return str.replace(/'(\d+)'/g, (_, x) => String.fromCharCode(x))
    .split``.reverse().join``;
};

console.log(decrypt("'101''99''105''108''65'4"));
