function isValidIP(str) {
  str = str.split(".");
  if (str.length !== 4) return false;
  let num;
  let flag = true;
  for (const data of str) {
    num = Number(data);
    console.log(num.toString(), data);
    if (num.toString() !== data) return false;
    if (num < 0 || num > 255) return false;
  }

  return true;
}

let str = "1.2.3.4";

console.log(isValidIP(str));
