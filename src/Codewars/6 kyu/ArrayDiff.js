function arrayDiff(a, b) {
  for (let i = 0; i < b.length; i++) {
    for (let j = 0; j < a.length; j++) {
      if (b[i] === a[j]) {
        a.splice(j, 1);
        j--;
      }
    }
  }
  return a;
}

console.log(arrayDiff([1, 2, 2, 2, 3], [2]));
