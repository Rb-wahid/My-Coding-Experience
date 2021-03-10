function removeSmallest(numbers) {
  if (numbers.length === 0)
    return [];

  let copyArr = Array.from(numbers);
  copyArr.sort((a, b) => a-b);
  let low = copyArr.shift();
  let lowElIndex = numbers.indexOf(low);
  numbers.splice(lowElIndex, 1);
 
  return numbers;
}

let arr = [
  365,
  264,
  141,
  269,
  29,
  139,
  159,
  373,
  60,
  353,
  126,239,28,
  46,
  355,
  139,
  308,
  72,
  389,
];

console.log(removeSmallest(arr));
