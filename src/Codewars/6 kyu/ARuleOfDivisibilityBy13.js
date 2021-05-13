function thirt(n) {
  // your code
  n = toStrArr(n);
  let first = sum(n);
  let s;
  let h;
  let flag = true;
  while (true) {
      s = sum(toStrArr(first));
      first = n;
      if (!s) {
          return h;
        }
        h = s;
  }

}

function toStrArr(n) {
  n = n.toString().split("").reverse();
  return n;
}

function sum(arr) {
  let a = [1, 10, 9, 12, 3, 4];
  let k = 0;
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    if (k > 5) k = 0;
    sum += Number(arr[i]) * a[k];
    k++;
  }
  return sum;
}

console.log(thirt(1111111111));
