function sortArray(array) {
  // Return a sorted array.
  let leng = array.length;
  let smallIndex;
  let flag;
  let value = array[0];

  for (let i = 0; i < leng; i++) {
    flag = false;
    smallIndex = 0;
    if ((array[i] & 1) === 1) {
      value = array[i];
      for (let j = i; j < leng; j++) {
        if (value > array[j] && (array[j] & 1) === 1) {
          value = array[j];
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

let array = [23, 48, -43, -29, 29, -22, 43, -38];
console.log(sortArray(array));
