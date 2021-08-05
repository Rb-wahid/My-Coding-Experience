function areEqual(value1, value2) {
  // Code here

  if (typeof value1 == "string" && typeof value2 == "string") {
    return strEqual(value1, value2);
  } else if (Array.isArray(value1) && Array.isArray(value2)) {
    if (Array.isArray(value1[0]) || typeof value1[0] != "object") {
      if (typeof value1[0] == "object") {
        value1 = value1.flat();
        value2 = value2.flat();
      }

      return arrayEqual(value1, value2);
    } else {
      let obj1 = {};
      let obj2 = {};

      for (let idx = 0; idx < value1.length; idx++) {
        for (const key in value1[idx]) {
          obj1[key] = value1[idx][key];
        }

        for (const key in value2[idx]) {
          obj2[key] = value2[idx][key];
        }
      }
      return objEqual(obj1, obj2);
    }
  } else if (typeof value1 == "object" && typeof value2 == "object") {
    return objEqual(value1, value2);
  } else {
    return false;
  }
}

const arrayEqual = (value1, value2) => {
  if (typeof value1[0] == "number") {
    value1 = value1.sort((a, b) => a - b);
    value2 = value2.sort((a, b) => a - b);
  } else {
    value1 = value1.sort();
    value2 = value2.sort();
  }

  return value1.every((el, idx) => el === value2[idx]);
};

const objEqual = (value1, value2) => {
  let key1 = Object.keys(value1);
  let key2 = Object.keys(value2);

  if (key1.length != key2.length) {
    return false;
  }
  return key1.every((key) => {
    if (typeof value1[key] != "object") {
      return value1[key] === value2[key];
    } else if (Array.isArray(value1[key]) && Array.isArray(value2[key])) {
      return arrayEqual(value1[key], value2[key]);
    } else if (typeof value1 == "object" && typeof value2 == "object") {
      return objEqual(value1[key], value2[key]);
    } else {
      return false;
    }
  });
};

const strEqual = (str1, str2) => {
  let regex = new RegExp(`[${str1}]+`);
  let match = str2.match(regex);

  return match[0].length == str1.length;
};


a = { 1: [true] };
b = { 1: true };

console.log(areEqual(a, b));
