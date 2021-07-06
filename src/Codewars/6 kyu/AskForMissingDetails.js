function askForMissingDetails(list) {
  // thank you for checking out the Coding Meetup kata :)
    
    
    return list.filter(dev => {
        let value = Object.values(dev);
        if (value.includes(null)) {
            let index = value.indexOf(null);
            let key = Object.keys(dev);
            dev["question"] = `Hi, could you please provide your ${key[index]}.`;
            return dev;
        }
    }, [])
}

var list1 = [
  {
    firstName: "null",
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
    language: "null",
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


console.log(askForMissingDetails(list1));