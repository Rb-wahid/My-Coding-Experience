multiplicationTable = function (size) {
  // insert code here
    let arr1 = [];
    let finalArr = [];
    let s = size;
    let i = 1;
    while (size > 0) {
         arr1 = [];
        for (let k = 1; k <= s; k++) {
            arr1.push(size * k);
            
        }
        i++
        finalArr.push(arr1);
        size--;
    }
    return finalArr.reverse();
};

console.log(multiplicationTable(4));