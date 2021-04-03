function solution(number) {
  // convert the number to a roman numeral

  let ans = [];
  number = number.toString().split("").reverse();
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

  if (
    typeof b === "undefined" &&
    typeof c === "undefined" &&
    typeof d === "undefined"
  )
    return units[Number(a) - 1];
  else if (typeof c === "undefined" && typeof d === "undefined") {
    return tens[Number(b) - 1] + units[Number(a) - 1];
  } else if (typeof d === "undefined")
    return hundreds[Number(c) - 1] + tens[Number(b) - 1] + units[Number(a) - 1];
  else {
    return (
      thousands[Number(d) - 1] +
      hundreds[Number(c) - 1] +
      tens[Number(b) - 1] +
      units[Number(a) - 1]
    );
  }
}

console.log(solution(15));
