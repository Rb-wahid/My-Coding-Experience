function strToHash(str) {
  // ...
  let hash = {};
  if (str)
    str.split`, `.forEach((el) => {
      const [key, value] = el.split`=`;
      hash[key] = Number(value);
    });
  return hash;
}

console.log(strToHash(""));
