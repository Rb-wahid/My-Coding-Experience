function nextHappyYear(year) {
  //your code here
  while (!isDistinct(year)) {
    year++;
  }
  return year;
}

function isDistinct(y) {
  y = y.toString().split("");
  let len = y.length;
  let arr = [];
  y.forEach((element) => {
    if (!arr.includes(element)) arr.push(element);
  });
  return y.length === arr.length;
}
console.log(isDistinct(1990));
console.log(nextHappyYear(5555));
