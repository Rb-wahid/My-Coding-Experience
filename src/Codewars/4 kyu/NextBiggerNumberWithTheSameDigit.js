function nextBigger(n) {
    let arr = Array.from(String(n), Number);
    let flag = false;
    let ans = "";

    for (let i = arr.length - 1; i >= 0; i--) {
        if (isGreater(arr[i], arr[i - 1])) {
            flag = true;
            temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            break;
        }
    }
    if (flag) {
        ans += arr.map(function (x) {
            return parseInt(x, 10);
        });
        ans = ans.replace(/,/g, "");
        return parseInt(ans, 10);
    }
    else
        return -1;
    
}

// console.log(nextBigger(5313));
function isGreater(a, b) {
    return a > b;

}



