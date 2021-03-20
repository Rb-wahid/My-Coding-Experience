function generateHashtag(str) {
    let arr = str.trim().split(" ");
    let ans = "#";

    for (let i = 0; i < arr.length; i++) {
        ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
    }
    return str.length === 0 | ans.length > 140 ? false : ans;
}

let text = " Hello there thanks for trying my Kata";

console.log(generateHashtag(text));