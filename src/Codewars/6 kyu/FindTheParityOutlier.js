function findOutlier(integers) {
  //your code here
  return integers.slice(0, 3).filter(even).length >= 2
    ? integers.find(odd)
    : integers.find(even);
}

const odd = (num) => num & 1;
const even = (num) => !odd(num);

let l = [160, 3, 1719, 19, 11, 13, -21];
console.log(findOutlier(l));
