function frequency(arr, options) {
  let isNum = typeof arr[0] == "number";
  let obj = {};
  let rst = [];
  let ans = [];

  if (options == undefined) {
    arr.forEach((el) => {
      obj[el] = (obj[el] || 0) + 1;
    });

    console.log(obj, " if");
  } else {
    let opra = Object.keys(options)[0];
    let fn = Object.values(options)[0];
    // console.log(obj,fn, rst)

    if (opra == "criteria") {
      for (let val of arr) {
        fnRst = fn(val);
        console.log("fnRst ", fnRst, " value ", val, " fn ", fn);
        obj[fnRst] = (obj[fnRst] || 0) + 1;
      }
    } else {
    }
    console.log(obj, " else");
  }

  let sort = [];
  let objKey = Object.keys(obj);
  if (!isNaN(Number(objKey[0]))) {
    console.log("sort for number ");
    sort = objKey.sort((a, b) => b - a);
  } else {
    console.log("sort for string ");
    sort = objKey.sort();
  }

  // console.log(sort, obj , " after sort");

  for (let key of sort) {
    if (isNaN(Number(key))) {
      console.log(typeof key, " str");
      rst.push([key, obj[key]]);
    } else {
      console.log(typeof key, " num", Number(key));
      rst.push([+key, +obj[key]]);
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

console.log(frequency([1, 10, 12, 2, 1, 10, 2, 2, 1, 2]));
