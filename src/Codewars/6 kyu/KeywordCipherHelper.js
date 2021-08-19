function KeywordCipher(abc, keyword) {
  const setMap = (valueArr, keyArr) => {
    let map = new Map();
    keyArr.forEach((el, i) => map.set(el, valueArr[i]));
    return map;
  };

  const strToSet = (set, str) => [...str].forEach((el) => set.add(el));

  const uniqueCharArr = (...args) => {
    let set = new Set();
    args.forEach((str) => {
      strToSet(set, str);
    });
    let setArr = Array.from(set);
    return setArr;
  };

  const getAns = (str, map) => {
    return [...str]
      .map((el) => {
        let value = map.get(el);
        if (value) {
          return value;
        } else {
          return el;
        }
      })
      .join("");
  };

  keys = uniqueCharArr(keyword, abc);
  main = [...abc];

  this.encode = function (str) {
    // ...
    let map = setMap(keys, main);
    return getAns(str, map);
  };

  this.decode = function (str) {
    // ...
    let map = setMap(main, keys);
    return getAns(str, map);
  };
}

var abc = "abcdefghijklmnopqrstuvwxyz";
var key = "tfozcivbsjhengarudlkpwqxmy";
var cipher = new KeywordCipher(abc, key);

console.log(cipher.encode("a_bc&*83"));
