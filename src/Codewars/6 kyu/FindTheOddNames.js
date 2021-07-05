function findOddNames(list) {
  // thank you for checking out the Coding Meetup kata :)
  let ans = [];
  list.forEach((dev) => {
    let sum = dev.firstName
      .split("")
      .reduce((sum, ch) => sum + ch.charCodeAt(0), 0);
    if (sum & 1) ans.push(dev);
  });
  return ans;
}

var list1 = [
  {
    firstName: "Aba",
    lastName: "N.",
    country: "Ghana",
    continent: "Africa",
    age: 21,
    language: "Python",
  },
  {
    firstName: "Abb",
    lastName: "O.",
    country: "Israel",
    continent: "Asia",
    age: 39,
    language: "Java",
  },
];

console.log(findOddNames(list1));
