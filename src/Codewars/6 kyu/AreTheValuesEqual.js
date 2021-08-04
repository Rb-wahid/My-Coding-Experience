function areEqual(value1, value2) {
  // Code here
  str1 = JSON.stringify(value1);
  str2 = JSON.stringify(value2);
  console.log(typeof str1, str2);
  let regex = new RegExp(`[${str1}]+`);
  str1 = [...str1].sort();
  str2 = [...str2].sort();

  return str1.every((el, idx) => el === str2[idx]);
}

const arrayEqual = (value1, value2) =>
  value1.every((val) => value2.includes(val));
a = { laura: 4, adam: 3 };
b = { laura: 4, adam: 3 };

console.log(areEqual(a, b));
