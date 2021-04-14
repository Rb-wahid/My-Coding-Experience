function encryptNum(number) {
  //Code here, good luck!
  let num = number.split("");
    let x = number.split(/[-,\s]/)[0];
    let a, b, c;
    if (x.length > 4) {
        a = x.slice(0, 1);
        b = x.slice(0, 3);
        c = x.slice(0, 4);
    } else {
        a = b = c = x; 
    }
  console.log(a, b, c);
  if (a === "1" || b === "+39" || c === "0039") {
    let index = num.length - 1;
    for (let i = 0; i < 6; i++) {
      if (/\d/.test(num[index])) {
        console.log(/\d/.test(num[index]), num[index]);
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

console.log(encryptNum("+393891456984"));
