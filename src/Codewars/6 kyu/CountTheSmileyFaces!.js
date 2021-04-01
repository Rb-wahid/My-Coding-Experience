//return the total number of smiling faces in the array
function countSmileys(arr) {
  let regex = /(:|;)+(-|~)*(\)|D)+/;
  let count = 0;

  arr.forEach((el) => {
    if (regex.test(el)) count++;
  });

  return count;
}

console.log(countSmileys([";D", ":-(", ":-)", ";~)"]));
