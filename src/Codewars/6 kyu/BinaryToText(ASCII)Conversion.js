function binaryToString(binary) {
  return binary.replace(/\d{8}/g, (a) => String.fromCharCode(parseInt(a, 2)));
}

console.log(
  binaryToString("01001011010101000100100001011000010000100101100101000101")
);
