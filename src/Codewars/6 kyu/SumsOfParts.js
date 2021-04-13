function partsSums(ls) {
    // your code
    let a = ls;
    let arr = [];
    while (a.length !== 0) {
        arr.push(a.reduce((a, b) => a + b));
        a.shift();
    }
    arr.push(0);
    return arr;
}

let ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358];

console.log(partsSums(ls));