function encryptNum(number) {
  //Code here, good luck!
  let num = number.split("");
  let a = number.split(/[-,\s]/)[0];
  if (a === "1" || a === "+39" || a === "0039") {
    let index = num.length - 1;
    for (let i = 0; i < 6; i++) {
      if (/\d/.test(Number(num[index]))) {
        num[index] = "X";
      } else {
        i--;
      }
      index--;
    }
    return num.join("");
  }
  return false;
}

console.log(encryptNum("11-211-458-7851"));
