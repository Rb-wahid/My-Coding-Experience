function sortStringsByVowels(strings) {
  var results = [];
  // do magic here
  results = strings.sort((str, str1) => {
    let a = numberOfVowels(str);
    let b = numberOfVowels(str1);

    if (a < b) return 1;
    else if (a > b) return -1;
    else return 0;
  });

  return results;
}

function numberOfVowels(str) {
  str = str.toLowerCase();
  let v = ["a", "e", "i", "o", "u"];
  let count = 0;
  let max = -1;
  for (let i = 0; i < str.length; i++) {
    if (v.includes(str.charAt(i))) {
      count++;
      max = Math.max(max, count);
    } else {
      max = Math.max(max, count);
      count = 0;
    }
  }
  return max;
}

//console.log(numberOfVowels("boot"));
console.log(sortStringsByVowels(["every", "bataux", "is", "waaaay", "loose"]));
