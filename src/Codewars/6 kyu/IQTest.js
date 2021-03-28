function iqTest(numbers) {
  // ...
  numbers = numbers.split(" ");
  let even = numbers.filter((el) => (el & 1) === 0);
  let odd = numbers.filter((el) => (el & 1) === 1);

  return even.length === 1
    ? numbers.indexOf(even[0]) + 1
    : numbers.indexOf(odd[0]) + 1;
}

console.log(iqTest("2 4 7 8 10"));
