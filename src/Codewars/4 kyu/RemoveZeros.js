function removeZeros(arr) {
  let head = [];
  let tail = [];
  for (const item of arr) {
    if (item === 0 || item === "0") tail[tail.length] = item;
    else head[head.length] = item;
  }
  return [...head, ...tail];
}

console.log(removeZeros([1, null, "5", "0", "2", 0, 8, 6, null, false]));
