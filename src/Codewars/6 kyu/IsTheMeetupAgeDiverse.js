function isAgeDiverse(list) {
  // thank you for checking out the Coding Meetup kata :)
  let arr = new Array(10).fill(false);
  const isTrue = (age) => {
    if (13 <= age && age < 20) arr[0] = true;
    else if (20 <= age && age < 30) arr[1] = true;
    else if (30 <= age && age < 40) arr[2] = true;
    else if (40 <= age && age < 50) arr[3] = true;
    else if (50 <= age && age < 60) arr[4] = true;
    else if (60 <= age && age < 70) arr[5] = true;
    else if (70 <= age && age < 80) arr[6] = true;
    else if (80 <= age && age < 90) arr[7] = true;
    else if (90 <= age && age < 100) arr[8] = true;
    else if (100 <= age) arr[9] = true;
  };
  list.map((dev) => isTrue(dev.age));
  return arr.every((v) => v == true);
}

var list1 = [
  {
    firstName: "Harry",
    lastName: "K.",
    country: "Brazil",
    continent: "Americas",
    age: 19,
    language: "Python",
  },
  {
    firstName: "Kseniya",
    lastName: "T.",
    country: "Belarus",
    continent: "Europe",
    age: 29,
    language: "JavaScript",
  },
  {
    firstName: "Jing",
    lastName: "X.",
    country: "China",
    continent: "Asia",
    age: 39,
    language: "Ruby",
  },
  {
    firstName: "Noa",
    lastName: "A.",
    country: "Israel",
    continent: "Asia",
    age: 40,
    language: "Ruby",
  },
  {
    firstName: "Andrei",
    lastName: "E.",
    country: "Romania",
    continent: "Europe",
    age: 59,
    language: "C",
  },
  {
    firstName: "Maria",
    lastName: "S.",
    country: "Peru",
    continent: "Americas",
    age: 60,
    language: "C",
  },
  {
    firstName: "Lukas",
    lastName: "X.",
    country: "Croatia",
    continent: "Europe",
    age: 75,
    language: "Python",
  },
  {
    firstName: "Chloe",
    lastName: "K.",
    country: "Guernsey",
    continent: "Europe",
    age: 88,
    language: "Ruby",
  },
  {
    firstName: "Viktoria",
    lastName: "W.",
    country: "Bulgaria",
    continent: "Europe",
    age: 98,
    language: "PHP",
  },
  {
    firstName: "Piotr",
    lastName: "B.",
    country: "Poland",
    continent: "Europe",
    age: 128,
    language: "JavaScript",
  },
];

console.log(isAgeDiverse(list1));
