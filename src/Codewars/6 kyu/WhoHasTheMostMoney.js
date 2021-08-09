function mostMoney(students) {
  // your code here
  let obj = {};

  students = students.map((student) => {
    let { name, fives, tens, twenties } = student;
    let sumMoney = fives * 5 + tens * 10 + twenties * 20;

    obj[sumMoney] = name;
    console.log(obj, sumMoney);

    return obj;
  });

  let keys = Object.keys(obj);
  if (students.length != keys.length && keys.length == 1) {
    return "all";
  }

  let sorted = keys.sort((a, b) => b - a);
  return sorted[0] == sorted[1] ? "all" : obj[sorted[0]];
}
