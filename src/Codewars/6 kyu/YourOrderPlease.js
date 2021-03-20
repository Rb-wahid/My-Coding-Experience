function order(words) {
  return words
    .split(" ")
    .sort((a, b) => a.match(/\d/) - b.match(/\d/))
    .join(" ");
}

let str = "4of Fo1r pe6ople g3ood th5e the2";

console.log(order(str));
