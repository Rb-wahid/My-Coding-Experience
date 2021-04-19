function howManySmaller(arr, n) {
  //coding here..
    return arr.map(a => a.toFixed(2)).filter(a => a < n).length;
}

console.log(howManySmaller([3.1288, 3.1212, 3.1205], 3.1212));