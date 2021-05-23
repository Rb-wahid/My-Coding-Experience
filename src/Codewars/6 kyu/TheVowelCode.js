function encode(string) {
  let obj = {
    a: 1,
    e: 2,
    i: 3,
    o: 4,
    u: 5,
  };

  for (const key in obj) {
    if (new RegExp(key, "g").test(string)) {
      string = string.replace(new RegExp(key, "g"), obj[key]);
    }
  }
  return string;
}

function decode(string) {
  let obj = {
    1: "a",
    2: "e",
    3: "i",
    4: "o",
    5: "u",
  };
  for (const key in obj) {
    if (new RegExp(key, "g").test(string)) {
      string = string.replace(new RegExp(key, "g"), obj[key]);
    }
  }
  return string;
}

console.log(encode("hello"));
console.log(decode("h2ll4"));
