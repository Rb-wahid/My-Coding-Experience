function largestPairSum(numbers) {
  //TODO: Write your Code here
  let max = numbers[0] + numbers[1];

  for (let i = 1; i < numbers.length - 1; i++) {
    if (numbers[i] + numbers[i + 1] > max) {
      max = numbers[i] + numbers[i + 1];
    }
  }
  return max;
}
