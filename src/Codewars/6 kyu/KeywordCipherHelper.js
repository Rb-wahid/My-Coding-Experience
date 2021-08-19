function KeywordCipher(abc, keyword) {
  const setMap = (valueArr, keyArr) => {
    let map = new Map();
    let i = 0;
    keyArr.forEach((el) => {
      map.set(el, valueArr[i]);
      i++;
    });
    return map;
  };
  const strToSet = (set, str) => [...str].forEach((el) => set.add(el));
  const uniqueChareacters = (...args) => {
    let keySet = new Set();
    args.forEach((arg) => {
      strToSet(keySet, arg);
    });
    let keySetArr = Array.from(keySet);
    return keySetArr;
  };

  keys = uniqueChareacters(keyword, abc);
  main = [...abc];
  this.encode = function (str) {
    // ...
    let map = setMap(keys, main);
    return [...str].map((el) => map.get(el)).join("");
  };
  this.decode = function (str) {
    // ...
    let map = setMap(main, keys);
    return [...str].map((el) => map.get(el)).join("");
  };
}

var abc = "abcdefghijklmnopqrstuvwxyz";
var key = "keyword";
var cipher = new KeywordCipher(abc, key);

console.log(cipher.encode("abchij"), cipher.decode("keyabc"));
