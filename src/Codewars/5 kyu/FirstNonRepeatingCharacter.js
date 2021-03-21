function firstNonRepeatingLetter(s) {
    // Add your code here
    let ans = "";

    for (let el of s) {
        if (s.match(new RegExp(el, "gi")).length === 1) {
            ans = el;
            break;
        }
    }
    return ans;
}

let s = "a";

console.log(firstNonRepeatingLetter(s));
