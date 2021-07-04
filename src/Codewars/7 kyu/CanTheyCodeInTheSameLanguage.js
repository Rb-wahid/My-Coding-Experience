function isSameLanguage(list) {
  // thank you for checking out the Coding Meetup kata :)
  let lan = {};
  list.forEach((dev) => (lan[dev.language] = dev.language));

  return Object.keys(lan).length == 1;
}

var list1 = [
  {
    firstName: "Daniel",
    lastName: "J.",
    country: "Aruba",
    continent: "Americas",
    age: 42,
    language: "JavaScript",
  },
  {
    firstName: "Kseniya",
    lastName: "T.",
    country: "Belarus",
    continent: "Europe",
    age: 22,
    language: "JavaScript",
  },
  {
    firstName: "Hanna",
    lastName: "L.",
    country: "Hungary",
    continent: "Europe",
    age: 65,
    language: "JavaScript",
  },
];

console.log(isSameLanguage(list1));
