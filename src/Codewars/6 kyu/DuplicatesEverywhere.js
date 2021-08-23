const removeDuplicateIds = (obj) => {
  //
  let arr = [];
  let keys = Object.keys(obj);
  keys.reverse().forEach((key) => {
    let value = obj[key];

    for (let i = 0; i < value.length; i++) {
      if (arr.includes(value[i])) {
        value.splice(i, 1);
        i--;
      } else {
        arr.push(value[i]);
      }
    }
    obj[key] = value;
  });
  return obj;
};

const obj1 = {
  1: ["C", "F", "G"],
  2: ["A", "B", "C"],
  3: ["A", "B", "D"],
};

const obj3 = {
  432: ["A", "A", "B", "D"],
  53: ["L", "G", "B", "C"],
  236: ["L", "A", "X", "G", "H", "X"],
  11: ["P", "R", "S", "D"],
};

console.log(removeDuplicateIds(obj1));
