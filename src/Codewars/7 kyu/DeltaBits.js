function convertBits(a, b) {
  return ((a ^ b).toString(2).match(/1/g) || []).length;
}

console.log(convertBits(31, 14));
