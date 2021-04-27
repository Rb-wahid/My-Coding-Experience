function distributionOf(golds) {
  //coding and coding..
  let sumForA = 0;
  let sumForB = 0;
  while (golds.length !== 0) {
    sumForA += golds[op(golds)] ? golds[op(golds)] : 0;
    golds.splice(op(golds), 1);

    sumForB += golds[op(golds)] ? golds[op(golds)] : 0;
    golds.splice(op(golds), 1);
  }
  return [sumForA, sumForB];
}
function op(arr) {
  let len = arr.length - 1;
  return arr[0] >= arr[len] ? 0 : len;
}

console.log(
  distributionOf([
    317,
    341,
    650,
    969,
    630,
    412,
    523,
    122,
    58,
    657,
    691,
    279,
    148,
    18,
    142,
    95,
    747,
    189,
    540,
    570,
    125,
    711,
    392,
    398,
    343,
    176,
    671,
    573,
    212,
    194,
    270,
    210,
    872,
    28,
    725,
    117,
    250,
    492,
    378,
    678,
    871,
  ])
);
