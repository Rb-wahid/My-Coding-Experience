function greatestCommonFactor(array) {
  // your code here
  const gcd = (a, b) => (b ? gcd(b, a % b) : a);
  return array.reduce((a, e) => gcd(a, e));
}
