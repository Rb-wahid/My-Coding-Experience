function evenOrOdd(str) {
  let arr = str.split("");
  let even = arr.filter((a) => (Number(a) & 1) === 0);
  let odd = arr.filter((a) => (Number(a) & 1) === 1);
  let sumOfEven = 0;
  sumOfEven = even.map((a) => sumOfEven + Number(a));
  let sumOfOdd = 0;
  sumOfOdd = even.map((a) => sumOfOdd + Number(a);
  );
  console.log(odd, even, sumOfEven, sumOfOdd);
  if (sumOfEven > sumOfOdd) return "Even is greater than Odd";
  else if (sumOfOdd > sumOfEven) return "Odd is greater than Even";
  else return "Even and Odd are the same";
}

console.log(evenOrOdd("12"));
