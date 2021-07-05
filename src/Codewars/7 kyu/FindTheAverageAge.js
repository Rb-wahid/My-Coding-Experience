function getAverageAge(list) {
  // thank you for checking out the Coding Meetup kata :)
  return Math.round(
    list.reduce((sum, dev) => sum + dev.age, 0) / Object.keys(list).length
  );
}

var list1 = [
  {
    firstName: "Maria",
    lastName: "Y.",
    country: "Cyprus",
    continent: "Europe",
    age: 30,
    language: "Java",
  },
  {
    firstName: "Victoria",
    lastName: "T.",
    country: "Puerto Rico",
    continent: "Americas",
    age: 70,
    language: "Python",
  },
];

console.log(getAverageAge(list1));
