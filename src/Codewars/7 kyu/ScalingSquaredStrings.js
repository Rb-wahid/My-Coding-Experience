function scale(strng, k, n) {
  // your code
  if (strng == "") {
    return strng;
  }
  return strng
    .split("\n")
    .map((str) => {
      let strRpt = [[...str].map((el) => el.padEnd(k, el)).join("")]
        .map((el) => el.padEnd((el.length + 1) * n, "\n" + el))
        .join("")
        .replace(/\n$/, "");
      return strRpt;
    })
    .join("\n");
}

var a = "abcd\nefgh\nijkl\nmnop";
console.log(scale(a, 2, 3));
