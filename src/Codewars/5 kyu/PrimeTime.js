function prime(num) {
  // Generate an array containing every prime number between 0 and the num specified (inclusive)
  const isPrime = new Array(num + 1);
  let prime = [];
  for (let i = 2; i <= num; i++) {
    isPrime[i] = true;
  }

  for (let i = 2; i <= num; i++) {
    if (isPrime[i]) {
      prime.push(i);

      for (let j = i * 2; j <= num; j += i) {
        isPrime[j] = false;
      }
    }
  }
  return prime;
}
