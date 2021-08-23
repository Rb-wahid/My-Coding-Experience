const removeDuplicateIds = (obj) => {
  //
    let arr = []
    let keys = Object.keys(obj);
    keys.reverse().forEach(key => {
        let value = obj[key];
               // console.log(value);

        for (const i in value) {
          //  console.log(value[i], arr, arr.indexOf(value[i]) );
            if (arr.indexOf(value[i]) == -1) {
                arr.push(value[i])
            } else {
               value.splice(i, 1);
           }
        }
        console.log(value);
        obj[key] = value;
    })
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