function binaryToString(binary) {
  let split = binary.match(/\d{8}/g);
  return !split
    ? ""
    : split.map((a) => String.fromCharCode(parseInt(a, 2))).join``;
}

console.log(
  binaryToString("01001011010101000100100001011000010000100101100101000101")
);
