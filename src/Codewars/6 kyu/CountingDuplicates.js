function duplicateCount(text) {
  //...
    let count = 0;
    let arr = [];
    let unic = [];

    for (const value of text.toLowerCase()) {
        if (arr.includes(value)) {
            if (!unic.includes(value)) {
                count++;
                unic.push(value);
            }
        } else {
            arr.push(value);
        }
    }
    return count;
}

let text = "Indivisibilities";

console.log(duplicateCount(text));