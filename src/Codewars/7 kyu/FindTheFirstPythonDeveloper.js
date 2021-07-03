function getFirstPython(list) {
  // Thank you for checking out my kata :)
  let pythonDev = list.find((dev) => dev.language == "Python");
  return pythonDev
    ? `${pythonDev.firstName}, ${pythonDev.country}`
    : "There will be no Python developers";
}

var list1 = [
  {
    firstName: "Mark",
    lastName: "G.",
    country: "Scotland",
    continent: "Europe",
    age: 22,
    language: "JavaScript",
  },
  {
    firstName: "Victoria",
    lastName: "T.",
    country: "Puerto Rico",
    continent: "Americas",
    age: 30,
    language: "Python",
  },
  {
    firstName: "Emma",
    lastName: "B.",
    country: "Norway",
    continent: "Europe",
    age: 19,
    language: "Clojure",
  },
];

console.log(getFirstPython(list1));
