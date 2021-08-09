function mostMoney(students) {
  // your code here
  const sum = ({ fives, tens, twenties }) =>
    fives * 5 + tens * 10 + twenties * 20;

  students.sort((a, b) => sum(b) - sum(a));

  if (students.length > 1 && sum(students[0]) == sum(students[1])) {
    return "all";
  }

  return students[0].name;
}
