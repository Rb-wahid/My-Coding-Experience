function frequency(arr, options) {
  let isNum = typeof arr[0] == "number";
  let obj = {};
  let rst = [];
  let ans = [];
  let sort = [];
  let compare = false;

  const countProp = (arr, fn) => {
    let temp = {};
    let fnRst;
    for (let val of arr) {
      if (fn == undefined) {
        temp[val] = (temp[val] || 0) + 1;
      } else {
        fnRst = fn(val);
        // console.log("fnRst ", fnRst, " value ", val, " fn ", fn[0]);
        temp[fnRst] = (temp[fnRst] || 0) + 1;
      }
    }

    return temp;
  };

  // start
  if (options == undefined) {
    obj = { ...countProp(arr) };
    console.log(obj, " if");
  } else {
    let opra = Object.keys(options);
    let fn = Object.values(options);

    if (opra.includes("criteria")) {
      obj = { ...countProp(arr, options["criteria"]) };
      //  console.log(obj, " criteria");
    }

    if (opra.includes("compareTo")) {
      const getKeyByValue = (object, value) => {
        return Object.keys(object).find((key) => object[key] === value);
      };
      compare = true;
      
      if (Object.keys(obj).length == 0) {
        obj = { ...countProp(arr) };
      }
      //     let func = fn.length > 0 ? fn[1] : fn[0];
      //   console.log(fn.length, fn[1], " funtion");
      // console.log(obj, " besfore compareTo");
      if (options["compareTo"].name == "frequencyCompare") {
        let objValue = Object.values(obj);

        sort = objValue
          .sort((a, b) => b - a)
          .map((val) => getKeyByValue(obj, val));
        // sort = objValue.map((value, i) =>
        // {
        //   console.log(obj[value], obj[objValue[i + 1]], value, objValue[i + 1]);
        //   return options["compareTo"](
        //     obj[value],
        //     obj[objValue[i + 1]],
        //     value,
        //     objValue[i + 1]
        //   );
        //   }

        // );
        console.log("Inside freqCom sorted ", sort);
      }
      if (options["compareTo"].name == "alphabeticalCompare") {
        console.log("inside alpha");
        let objKey = Object.keys(obj);
        console.log("key ", objKey);
        sort = objKey.sort((a, b) => options["compareTo"](a,b));
      }

      console.log(sort, " after compareTo");
    }
    // console.log(obj, " else");
  }
  console.log(compare);
  if (!compare) {
    let objKey = Object.keys(obj);
    if (!isNaN(Number(objKey[0]))) {
      //  console.log("sort for number ");
      sort = objKey.sort((a, b) => a - b);
    } else {
      //  console.log("sort for string ");
      sort = objKey.sort();
    }
  }

  // console.log(sort, obj , " after sort");

  for (let key of sort) {
    if (!isNaN(Number(key))) {
      //  console.log(typeof key, " num", Number(key));
      rst.push([+key, +obj[key]]);
    } else {
      //  console.log(typeof key, " str");
      rst.push([key, obj[key]]);
    }
  }

  return rst;
}

function isEven(number) {
  return number % 2 === 0;
}

function parity(number) {
  return isEven(number) ? "even" : "odd";
}

function frequencyCompare(value1, value2, freq1, freq2) {
  return freq2 - freq1;
}

function alphabeticalCompare(value1, value2) {
  if (String(value1) < String(value2)) {
    return -1;
  } else if (String(value1) > String(value2)) {
    return 1;
  } else {
    return 0;
  }
}

function profession(person) {
  return person.profession;
}

function id(value) {
  return value;
}

//console.log(frequency([1, 2, 3, 4, 5, 6, 7], { criteria: parity }));

console.log(
  frequency([1, 10, 12, 2, 1, 10, 2, 2], { compareTo: alphabeticalCompare })
);

//frequency([{name: 'Peter', profession: 'teacher'}, {name: 'Michael', profession: 'teacher'}, {name: 'Anna', profession: 'scientific'}, {name: 'Rose', profession: 'scientific'}, {name: 'Anna', profession: 'scientific'}, {name: 'Anna', profession: 'politician'}], {criteria: profession, compareTo: frequencyCompare}), [["scientific", 3], ["teacher", 2], ["politician", 1]]);
