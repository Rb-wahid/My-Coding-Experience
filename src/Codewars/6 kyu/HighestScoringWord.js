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
            sum +=  str.charCodeAt(j) - 96;
            console.log(sum);
        }
        
        if (high < sum) {
            high = sum;
            highValue = str;
        }
    }
    return highValue;
}

let x = "b aa";

console.log(high(x));
