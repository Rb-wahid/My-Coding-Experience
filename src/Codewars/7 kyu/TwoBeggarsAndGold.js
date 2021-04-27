function distributionOf(golds) {
  //coding and coding..
  let sumForA = 0;
  let sumForB = 0;
  while (golds.length !== 0) {
     
    sumForA += golds[op(golds)];
    console.log("1nd ", golds[op(golds)]);
      golds.splice(op(golds), 1);
      console.log(golds);

    sumForB += golds[op(golds)];
    console.log("2nd ", golds[op(golds)]);
     golds.splice(op(golds), 1);
      console.log(golds);
  }
    return [sumForA, sumForB];
}
function op(arr) {
  let len = arr.length - 1;
  return arr[0] >= arr[len] ? 0 : len;
}

console.log(distributionOf([4, 7, 2, 9, 5, 2]));
