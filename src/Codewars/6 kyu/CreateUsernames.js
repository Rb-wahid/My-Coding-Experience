function addUsername(list) {
  // thank you for checking out the Coding Meetup kata :)
    return list.map(dev => {
        let age = new Date().getFullYear() - dev.age;
        let username = (dev.firstName + dev.lastName.charAt(0)).toLowerCase() + age;
        dev["username"] = username;
        return dev;
    })
}


var list1 = [
  {
    firstName: "Emily",
    lastName: "N.",
    country: "Ireland",
    continent: "Europe",
    age: 30,
    language: "Ruby",
  },
  {
    firstName: "Nor",
    lastName: "E.",
    country: "Malaysia",
    continent: "Asia",
    age: 20,
    language: "Clojure",
  },
];

console.log(addUsername(list1));