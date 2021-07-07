function removeZeros(arr) {
    let n = arr.length;
    
  for (let i = 0; i < n - 1; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] == 0 && arr[j + 1] !== 0) {
        if (arr[j + 1] !== "0") {
          [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
        }
      }
    }
  }
  return arr;
}

console.log(removeZeros([1, null, "5", "0", "2", 0, 8, 6, null, false]));
