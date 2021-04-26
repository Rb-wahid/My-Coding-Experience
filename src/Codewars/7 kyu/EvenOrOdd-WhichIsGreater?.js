function evenOrOdd(str) {
  let arr = str.split("");
  arr = arr.map((a) => Number(a));

  let sumOfEven = arr.filter((a) => (a & 1) === 0).reduce((a, c) => a + c);
  let sumOfOdd = arr.filter((a) => (a & 1) === 1).reduce((a, c) => a + c);

  if (sumOfEven > sumOfOdd) return "Even is greater than Odd";
  else if (sumOfOdd > sumOfEven) return "Odd is greater than Even";
  else return "Even and Odd are the same";
}

console.log(evenOrOdd("112"));
