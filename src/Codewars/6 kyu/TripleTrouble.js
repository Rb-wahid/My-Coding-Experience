function tripledouble(num1, num2) {
  //code me
  for (let i = 0; i < 10; i++) {
    if (new RegExp(`${i}{3}`).test(num1) && new RegExp(`${i}{2}`).test(num2)) {
      return 1;
    }
  }

  return 0;
}

console.log(tripledouble(915525199994, 839559181));
