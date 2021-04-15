function findOutlier(integers) {
  //your code here
  let odd = [];
  let even = [];
    let i = 0;
  for (let a of integers) {
      a & 1 ? odd.push(a) : even.push(a);
      i++;
    if (even.length >= 1 && odd.length >= 1 && i >= 3) {
      return even.length < odd.length ? even[0] : odd[0];
    }
  }
}

let l = [160, 3, 1719, 19, 11, 13, -21];
console.log(findOutlier(l));
