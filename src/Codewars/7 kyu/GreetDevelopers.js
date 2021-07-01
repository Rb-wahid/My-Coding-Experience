function greetDevelopers(list) {
  // thank you for checking out my kata :)
  let greeting;
  for (const key of list) {
    greeting = `Hi ${key.firstName}, what do you like the most about ${key.language}?`;
    key["greeting"] = greeting;
  }
  return list;
}

var list1 = [
  {
    firstName: "Sofia",
    lastName: "I.",
    country: "Argentina",
    continent: "Americas",
    age: 35,
    language: "Java",
  },
  {
    firstName: "Lukas",
    lastName: "X.",
    country: "Croatia",
    continent: "Europe",
    age: 35,
    language: "Python",
  },
  {
    firstName: "Madison",
    lastName: "U.",
    country: "United States",
    continent: "Americas",
    age: 32,
    language: "Ruby",
  },
];

console.log(greetDevelopers(list1));
