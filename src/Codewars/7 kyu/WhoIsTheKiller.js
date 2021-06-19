function killer(suspectInfo, dead) {
  return Object.keys(suspectInfo).find((suspect) =>
    dead.every((person) => suspectInfo[suspect].includes(person))
  );
}

let suspects = {
  James: ["Jacob", "Bill", "Lucas"],
  Johnny: ["David", "Kyle", "Lucas"],
  Peter: ["Lucy", "Kyle"],
};

let dead = ["Lucas", "Bill"];
console.log(killer(suspects, dead));
