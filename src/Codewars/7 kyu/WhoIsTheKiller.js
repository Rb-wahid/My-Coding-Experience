function killer(suspectInfo, dead) {
  //your code here...
  let flag;
  for (const key in suspectInfo) {
    flag = true;
    dead.forEach((element) => {
      if (!suspectInfo[key].includes(element)) {
        flag = false;
      }
    });
    if (flag) return key;
  }
}

let suspects = {
  James: ["Jacob", "Bill", "Lucas"],
  Johnny: ["David", "Kyle", "Lucas"],
  Peter: ["Lucy", "Kyle"],
};

let dead = ["Lucas", "Bill"];
console.log(killer(suspects, dead));
