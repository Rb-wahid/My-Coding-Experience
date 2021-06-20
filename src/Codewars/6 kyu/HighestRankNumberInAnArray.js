function highestRank(array) {
  //Your Code logic should written here
  let ans = Array(100).fill(0);
  ans = array.map((a) => ans[a]++);
  let max = ans[0];
  let index = 0;
  console.log("ans ", ans);
  ans.forEach((v, i, arr) => {
    if (max === arr[i + 1]) {
      index = array[max] > array[arr[i + 1]] ? i : i + 1;
    } else if (max < arr[i + 1]) {
      max = arr[i + 1];
      index = i + 1;
    }
  });
  return array[index - 1];
}

console.log(highestRank([12, 10, 8, 12, 7, 6, 4, 10, 12, 10]));
