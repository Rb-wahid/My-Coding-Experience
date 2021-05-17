var nbrOfLaps = (x, y) => {
  const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
  const lcm = (x * y) / gcd(x, y);

  return [lcm / x, lcm / y];
};

console.log(nbrOfLaps(5, 3));
