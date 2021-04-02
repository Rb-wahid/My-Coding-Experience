function deleteNth(arr, n) {
  // ...
    let count;
   for (let index = 0; index < arr.length; index++) {
       count = 0;
        for (let index2 = 0; index2 < arr.length; index2++) {
            if (arr[index] === arr[index2]) {
                count++;
                 if (count > n) {
                   arr[index2] = null;
                 }
            }
        }
   }
    return arr.filter(a => a !== null);
}

console.log(deleteNth([37, 37, 20, 21], 1));