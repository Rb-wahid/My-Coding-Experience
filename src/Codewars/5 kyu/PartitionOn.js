// partition the items array so that all values for which pred returns true are
// at the end, returning the index of the first true value

function partitionOn(pred, items) {
  let head = [];
  let tail = [];
  items.forEach((item) => {
    if (pred(item)) {
      tail.push(item);
    } else {
      head.push(item);
    }
  });
  let temp = [...head, ...tail];
  items = items.map((v, i) => (items[i] = temp[i]));
  return head.length;
}

var items = [1, 2, 3, 4, 5, 6];
function isEven(n) {
  return n % 2 == 0;
}

var i = partitionOn(isEven, items);

console.log(i, items);
