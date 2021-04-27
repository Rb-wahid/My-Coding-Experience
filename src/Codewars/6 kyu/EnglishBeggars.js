function beggars(values, n) {
  let ans = Array(n).fill(0);
  values.forEach((element, index) => {
    ans[index % n] += element;
  });

  return ans;
}

console.log(beggars([1, 2, 3, 4, 5], 3));
