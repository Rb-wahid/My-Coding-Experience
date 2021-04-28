function bingo(a) {
  // your winning code here
    let arr = [2, 9, 14, 7, 15];
    for (let i = 0; i < 5; i++) {
        if (!a.includes(arr[i]))
            return "LOSE";
    }
    return "WIN"
}
console.log(bingo([21,13,2,7,5,14,7,15,9,10]));