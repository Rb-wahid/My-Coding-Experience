function solution(number) {
  // convert the number to a roman numeral
  number = number.toString().split("").reverse();
  console.log(number);
  let len = number.length;
  switch (len) {
    case 1:
      return op(number[0]);
    case 2:
      return op(number[0], number[1]);
    case 3:
      return op(number[0], number[1], number[2]);
    case 4:
      return op(number[0], number[1], number[2], number[3]);
  }
}

function op(a, b, c, d) {
  let units = ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"];
  let tens = ["X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"];
  let hundreds = ["C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"];
  let thousands = ["M", "MM", "MMM"];
  let ans = [];

  if (
    typeof b === "undefined" &&
    typeof c === "undefined" &&
    typeof d === "undefined"
  )
    ans.push(units[Number(a) - 1]);
  else if (typeof c === "undefined" && typeof d === "undefined") {
    ans.push(tens[Number(b) - 1]);
    ans.push(units[Number(a) - 1]);
  } else if (typeof d === "undefined") {
    ans.push(hundreds[Number(c) - 1]);
    ans.push(tens[Number(b) - 1]);
    ans.push(units[Number(a) - 1]);
  } else {
    ans.push(thousands[Number(d) - 1]);
    ans.push(hundreds[Number(c) - 1]);
    ans.push(tens[Number(b) - 1]);
    ans.push(units[Number(a) - 1]);
  }
    return ans.filter(a => a !== "undefined").join("");
}

console.log(solution(100));
