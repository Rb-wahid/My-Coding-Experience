function findMissingLetter(array) {
    let start = array[0].charCodeAt(0);
    let last = array[array.length - 1].charAt(0);

    for (let i = 0; i < array.length; i++) {
        console.log(start, array[i].charCodeAt(0));
        if (start !== array[i].charCodeAt(0)) {
            return String.fromCharCode(start);
        }
        start++;
    }
  return " ";
}

console.log(findMissingLetter(["a", "b", "c", "d", "f"]));