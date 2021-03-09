function findUniq(arr) {
  // do magic
  let a = 0;
  let b = 0;
  let data = arr[0];
  let flag;
  for (let i = 1; i < arr.length - 2; i++) {
    flag = check(arr[i], arr[i + 1], arr[i + 2]);
    if (flag) {
      return flag;
    }
  }
}

function check(a, b, c) {
  if (a === b) return c;
  else if (a === c) return b;
  else if (b === c) return a;
  else false;
}

let arr = [0, 1, 0];
console.log(findUniq(arr));
