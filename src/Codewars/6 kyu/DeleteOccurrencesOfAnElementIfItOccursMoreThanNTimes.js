function deleteNth(arr, n) {
  // ...
  let count = [];
  return arr.filter((el) => {
    count[el] = ~~count[el] + 1;
    return count[el] <= n;
  });
}

console.log(deleteNth([37, 37, 20, 21], 1));
