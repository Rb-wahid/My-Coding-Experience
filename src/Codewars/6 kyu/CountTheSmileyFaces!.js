//return the total number of smiling faces in the array
function countSmileys(arr) {
  let regex = /[:;][-~]?[)D]/;

  return arr.filter(a => regex.test(a)).length;
}

console.log(countSmileys([":D", ":~)", ";~D", ":)"]));
