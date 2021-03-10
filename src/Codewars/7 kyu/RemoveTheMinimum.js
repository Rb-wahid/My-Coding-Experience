function removeSmallest(numbers) {
  let smallestNum = Math.min.apply(Math, numbers);
  let indexOfSmallestNum = numbers.indexOf(smallestNum);

  numbers.splice(indexOfSmallestNum, 1);

  return numbers;
}

let arr = [365];

console.log(removeSmallest(arr));
