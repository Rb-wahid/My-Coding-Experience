function distributionOf(golds) {
  //coding and coding..
  let sumForA = 0;
  let sumForB = 0;
  let len = golds.length - 1;
  while (len >= 0) {
    if (len >= 0)
      sumForA += golds[0] >= golds[len] ? golds.shift() : golds.pop();
    len = golds.length - 1;

    if (len >= 0)
      sumForB += golds[0] >= golds[len] ? golds.shift() : golds.pop();
    len = golds.length - 1;
  }
  return [sumForA, sumForB];
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
