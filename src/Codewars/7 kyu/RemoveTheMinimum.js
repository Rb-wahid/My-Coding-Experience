function removeSmallest(numbers) {
  let leng = numbers.length;
  if (numbers.length === 0)
    return [];
  
  let data;
  for (let i = 0; i < leng - 1; i++) {
    if (numbers[i] < numbers[i+1]) {
      let temp = numbers[i];
      numbers[i] = numbers[i + 1];
      numbers[i + 1] = temp;
    }
  }
  numbers.splice(leng - 1, 1);
  return numbers;
}

let arr = [5, 3, 2, 1, 4];

console.log(removeSmallest(arr));