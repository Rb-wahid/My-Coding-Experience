const RomanNumerals = {};

RomanNumerals.toRoman = function (num) {
  let units = {
    1: "I",
    2: "II",
    3: "III",
    4: "IV",
    5: "V",
    6: "VI",
    7: "VII",
    8: "VIII",
    9: "IX",
  };

  let tens = {
    1: "X",
    2: "XX",
    3: "XXX",
    4: "XL",
    5: "L",
    6: "LX",
    7: "LXX",
    8: "LXXX",
    9: "XC",
  };

  let hundreds = {
    1: "C",
    2: "CC",
    3: "CCC",
    4: "CD",
    5: "D",
    6: "DC",
    7: "DCC",
    8: "DCCC",
    9: "CM",
  };

  let thousands = {
    1: "M",
    2: "MM",
    3: "MMM",
  };
  let arr = Array.from(String(num), Number).reverse();
  return [
    units[arr[0]] || "",
    tens[arr[1]] || "",
    hundreds[arr[2]] || "",
    thousands[arr[3]] || "",
  ].reverse().join``;
};

RomanNumerals.fromRoman = function (str) {
  let units = [
    [3000, "MMM"],
    [2000, "MM"],
    [1000, "M"],
    [900, "CM"],
    [800, "DCCC"],
    [700, "DCC"],
    [600, "DC"],
    [500, "D"],
    [400, "CD"],
    [300, "CCC"],
    [200, "CC"],
    [100, "C"],
    [90, "XC"],
    [80, "LXXX"],
    [70, "LXX"],
    [60, "LX"],
    [50, "L"],
    [40, "XL"],
    [30, "XXX"],
    [20, "XX"],

    [9, "IX"],
    [10, "X"],
    [8, "VIII"],
    [7, "VII"],
    [6, "VI"],
    [4, "IV"],
    [5, "V"],
    [3, "III"],
    [2, "II"],
    [1, "I"],
  ];

  let ans = 0;
  let regex;
  while (str.length != 0) {
    for (const arr of units) {
      regex = new RegExp(`${arr[1]}`);
      if (regex.test(str)) {
        console.log(regex, regex.test(str), arr[1], arr[0]);
        ans += arr[0];
      }
     // console.log(str);
      str = str.replace(regex, "");
     // console.log(str);
    }
  }
  return ans;
};

console.log(RomanNumerals.toRoman(1991)); // should return 'M'
console.log(RomanNumerals.fromRoman("IV")); // should return 1000
//MDCLXIX
