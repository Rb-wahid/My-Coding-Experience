function removeSmallest(numbers) {
  let length = numbers.length;

  if (length > 2) {
    let copyArr = Array.from(numbers);
    copyArr.sort((a, b) => a - b);
    let low = copyArr.splice(0, 1);
    let lowElIndex = numbers.indexOf(low[0]);
    if (lowElIndex != length) numbers.splice(lowElIndex, 1);
    return numbers;
  }

  return [];
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
  126,
  239,
  28,
  46,
  355,
  139,
  308,
  72,
  389,
];

console.log(removeSmallest(arr));
