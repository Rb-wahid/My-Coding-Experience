function findUniq(arr) {
  // do magic
  let flag;
  for (let i = 0; i < arr.length - 2; i++) {
    flag = check(arr[i], arr[i + 1], arr[i + 2]);
    if (flag) {
      return flag;
    }
  }
}

function check(a, b, c) {
  if (a === b && b === c) return false;
  else if (a === b) return c;
  else if (a === c) return b;
  else return a;
}

let arr = [1, 1, 1, 2, 1, 1];
console.log(findUniq(arr));
