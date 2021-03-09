var moveZeros = function (arr) {
  // TODO: Program me
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 0) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] !== 0) {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
        }
    }
  }

  return arr;
};

let arr = [1, 2, 1, 0, 0, 1, 0, 3, 0, 1];

console.log(moveZeros(arr));
