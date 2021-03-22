function scramble(str1, str2) {
  let arr1 = str1.split("").sort();
  let arr2 = str2.split("").sort();

  let i = 0;
  let j = 0;
  for (j = 0; i < arr2.length && j <= arr1.length; j++) {
    if (arr1[j] === arr2[i]) {
      i++;
    }
  }
  return j <= arr1.length;
}

let str1 = "";
let str2 = "";

console.log(scramble(str1, str2));
