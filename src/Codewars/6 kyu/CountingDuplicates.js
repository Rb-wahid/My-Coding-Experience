function duplicateCount(text) {
  //...
    let count = 0;
    let arr = [];
    let unic = [];

    for (const value of text) {
        if (arr.includes(value)) {
            if (!unic.includes(value)) {
                count++;
            } else {
                unic.push(value);
            }
        } else {
            arr.push(value);
        }
    }
    return count;
}

let text = "abcde";

console.log(duplicateCount(text));