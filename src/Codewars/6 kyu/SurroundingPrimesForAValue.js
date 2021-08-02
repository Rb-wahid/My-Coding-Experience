function primeBefAft(n) {
  if (n < 2) {
    return 0;
  }
  let isPrimes = new Array(200001);
  let primes = [];
  let firstP = -1;
  let lastPIdx = -1;
  for (let i = 2; i < isPrimes.length; i++) {
    isPrimes[i] = true;
  }

  for (let i = 2; i < isPrimes.length; i++) {
    if (isPrimes[i]) {
      primes.push(i);
      for (let j = i * 2; j < isPrimes.length; j += i) {
        isPrimes[j] = false;
      }
    }
      if (i == n) {
          lastPIdx = primes.length;
          firstP = isPrimes[n] ? primes.length-1 :  primes.length;
      console.log(primes.length);
    }
  }
console.log(primes);
  console.log(primes[firstP-1], primes[lastPIdx]);
 // return [firstP, primes[lastPIdx]];
}

console.log(primeBefAft(100));
