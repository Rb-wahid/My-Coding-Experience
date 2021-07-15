// partition the items array so that all values for which pred returns true are
// at the end, returning the index of the first true value

function partitionOn(pred, items) {
  let t = items.filter(pred);
  let f = items.filter((el) => !pred(el));
  items.length = 0;

  for (let i = 0; i < f.length; i++) {
    items.push(f[i]);
  }

  for (let i = 0; i < t.length; i++) {
    items.push(t[i]);
  }

  return f.length;
}

var items = [1, 2, 3, 4, 5, 6];
function isEven(n) {
  return n % 2 == 0;
}

var i = partitionOn(isEven, items);

console.log(i, items);
