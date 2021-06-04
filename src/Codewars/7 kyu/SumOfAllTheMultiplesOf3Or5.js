function findSum(n) {
  let sum = 0;
  while (n > 0) {
    if (!(n % 3) || !(n % 5)) sum += n;

    n--;
  }
  return sum;
}
