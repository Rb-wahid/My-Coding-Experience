function high(x) {
    let arr = x.split(" ");
    let high = 0;
    let highValue;
    let sum;
    let str;

    for (let i = 0; i < arr.length; i++) {
        sum = 0;
        str = arr[i];

        for (let j = 0; j < str.length; j++) {
            sum += str.charCodeAt(j);
        }
        
        if (high < sum) {
            high = sum;
            highValue = str;
        }
    }
    return highValue;
}

let x = "man i need a taxi up to ubud";

console.log(high(x));