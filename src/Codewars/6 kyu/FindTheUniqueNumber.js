function findUniq(arr) {
  // do magic
    let first = arr[0];
    let second = arr[1];
    let third = arr[2];

    if (first === second) {
        return arr.find(item => item != first);
    } else {
        return arr.find(item => item != third);
    }
}

let arr = [ 1, 1, 1];
console.log(findUniq(arr));
