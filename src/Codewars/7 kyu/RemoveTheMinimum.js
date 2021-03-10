function removeSmallest(numbers) {
  let newArr = [...numbers];
  let smallestNum = Math.min.apply(null, newArr);
  let indexOfSmallestNum = newArr.indexOf(smallestNum);

  newArr.splice(indexOfSmallestNum, 1);

  return newArr;
}

let arr = [365];

console.log(removeSmallest(arr));
