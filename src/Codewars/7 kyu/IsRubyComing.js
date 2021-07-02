function isRubyComing(list) {
  // thank you for checking out my kata :)
    return list.some(dev => dev.language == 'Ruby');
}


var list1 = [
  {
    firstName: "Emma",
    lastName: "Z.",
    country: "Netherlands",
    continent: "Europe",
    age: 29,
    language: "Ruby",
  },
  {
    firstName: "Piotr",
    lastName: "B.",
    country: "Poland",
    continent: "Europe",
    age: 128,
    language: "Javascript",
  },
  {
    firstName: "Jayden",
    lastName: "P.",
    country: "Jamaica",
    continent: "Americas",
    age: 42,
    language: "JavaScript",
  },
];


console.log(isRubyComing(list1));