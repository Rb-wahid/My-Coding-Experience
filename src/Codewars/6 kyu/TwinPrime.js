function isTwinPrime(n) {
  const isPrime = new Array(n + 3);
  const prime = [];

  for (let i = 2; i <= n + 2; i++) {
    isPrime[i] = true;
  }

  for (let i = 2; i <= n + 2; i++) {
    if (isPrime[i]) {
      prime.push(i);
      for (let j = i * 2; j <= n + 2; j += i) {
        isPrime[j] = false;
      }
    }
  }

  if (prime.includes(n) && (prime.includes(n - 2) || prime.includes(n + 2))) {
    return true;
  } else {
    return false;
  }
  return `^(~_~)^`;
}
