function primeBefAft(n) {
  const isPrime = (n) => {
    if (n % 2 == 0) {
      return false;
    }

    for (let i = 3; i * i <= n; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  };

  const isNotPrime = (n) => !isPrime(n);
  let before = n - 1;
  let after = n + 1;

  while (isNotPrime(before)) {
    before -= 1;
  }

  while (isNotPrime(after)) {
    after += 1;
  }
  return [before, after];
}

console.log(primeBefAft(100));
