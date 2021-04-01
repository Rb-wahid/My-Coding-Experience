function longestConsec(strarr, k) {
    // your code
    let n = strarr.length;
    if (n === 0 || k > n || k <= 0)
        return "";
    let arr = [];
    let str;
    let j;
    for (let i = 0; i < strarr.length - 1; i++) {
        j = 0;
        str = "";

        while (j < k) {
            str += strarr[i + j];
            j++;
        }
        arr.push(str);
    }
    return arr.sort((a, b) => b.length - a.length)[0];
}

let strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"];

console.log(longestConsec(strarr, 2));