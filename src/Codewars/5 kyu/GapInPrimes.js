function gap(g, m, n) {
  // your code
  let isPrime = new Array(n + 1);
  let primes = [];

  for (let i = 2; i < isPrime.length; i++) {
    isPrime[i] = true;
  }

  for (let i = 2; i < isPrime.length; i++) {
    if (isPrime[i]) {
      if (i >= m && i <= n) {
        let a = i;
        let b = primes[primes.length - 1];
        if (a - b == g) {
          return [b, a];
        }

        primes.push(i);
      }
      for (let j = i * 2; j <= isPrime.length; j += i) {
        isPrime[j] = false;
      }
    }
  }
  return null;
}

console.log(gap(10, 300, 400));
