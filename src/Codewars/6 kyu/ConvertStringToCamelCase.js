function toCamelCase(str) {
    let arr = str.split(/-|_/);
    let ans = arr[0];
    for (let i = 1; i < arr.length; i++) {
        ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
    }
    return ans;
}

let text = "the-stealth_warrior";

console.log(toCamelCase(text));