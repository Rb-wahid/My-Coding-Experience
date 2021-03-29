function findMissingLetter(array) {
    let start = array[0].charCodeAt(0);

    for (let i = 0; i < array.length; i++) {
        if (start + i !== array[i].charCodeAt(0)) {
            return String.fromCharCode(start + i);
        }
    }
  return " ";
}

console.log(findMissingLetter(["a", "b", "c", "d", "f"]));