function sortArray(array) {
  // Return a sorted array.
  let leng = array.length;
  let smallIndex;
  let flag;
  for (let i = 0; i < leng; i++) {
    flag = false;
    if ((array[i] & 1) === 1) {
      for (let j = i + 1; j < leng; j++) {
        if ((array[j] & 1) === 1 && array[j] < array[i]) {
          smallIndex = j;
          flag = true;
        }
      }
      if (flag) {
        let temp = array[i];
        array[i] = array[smallIndex];
        array[smallIndex] = temp;
      }
    }
  }
  return array;
}

let array = [1, 5, 1, 11, 2, 11, 111, 0];
console.log(sortArray(array));
