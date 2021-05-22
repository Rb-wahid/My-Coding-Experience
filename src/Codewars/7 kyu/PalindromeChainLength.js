var palindromeChainLength = function (n) {
  let reverse;
  let count = 0;
  while (true) {
    n = n.toString();
    reverse = n.split``.reverse().join``;

    if (n === reverse) {
      break;
    } else {
      count++;
      n = +n + +reverse;
    }
  }
  return count;
};

console.log(palindromeChainLength(87));
