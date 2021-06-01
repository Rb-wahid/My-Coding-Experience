/**
 * Your solution
 * @date JS Date object
 **/
function solution(date) {
  let op = (d) => {
    if (d > 9) {
      d = d.toString().split``;
      return +d[0] + +d[1];
    }
    return +d;
  };
  let digit = date.toLocaleDateString().replace(/\D/g, "");

  return op(digit.split``.reduce((a, b) => op(a) + op(b)));
}

console.log(solution(new Date("02/04/2010")));
