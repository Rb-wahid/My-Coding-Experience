function twinPrime(n) {
  if (n < 2) {
    return 0;
  }
  const isTwin = (i, arr) => arr[i] - arr[i - 1] == 2;
  let isPrimes = new Array(n + 2);
  let count = 0;
  for (let i = 2; i < isPrimes.length; i++) {
    isPrimes[i] = true;
  }

  for (let i = 2; i < isPrimes.length; i++) {
    if (isPrimes[i]) {
      for (let j = i * 2; j < isPrimes.length; j += i) {
        isPrimes[j] = false;
      }
    }
  }
  for (let i = 2; i < isPrimes.length; i += 1) {
    if (isPrimes[i - 1] && isPrimes[i + 1]) {
      count += 1;
    }
  }
  return count;
}

console.log(twinPrime(6));
