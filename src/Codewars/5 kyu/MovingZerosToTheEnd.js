var moveZeros = function (arr) {
  // TODO: Program me
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 0) {
            sheftItem(i, arr);
        }
    }
    
    return arr;
};

function sheftItem(index, arr) {
    for (let i = index; i < arr.length - 1; i++) {
        arr[i] = arr[i+1]
    }

    arr[arr.length - 1] = 0;
}


let arr = [false, 1, 0, 1, 2, 0, 1, 3, "a"];

console.log(moveZeros(arr));