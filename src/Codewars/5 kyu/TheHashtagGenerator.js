function generateHashtag(str) {
    let arr = str.trim().split(" ");
    let ans = "#";

    for (let i = 0; i < arr.length; i++) {
        ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
    }
    return ans;
}

let text = " Hello there thanks for trying my Kata";

console.log(generateHashtag(text));