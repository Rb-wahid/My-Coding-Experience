let arrayDiff = (a, b) => a.filter((el) => !b.includes(el));

console.log(arrayDiff([1, 2, 2, 2, 3], [2]));
