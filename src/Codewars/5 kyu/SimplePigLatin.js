function pigIt(str) {
  //Code here
    let ans = "";
    return str.split(" ").map(str =>  op(str)).join(" ");
}

function op(str) {
    str = str.split("");
    let len = str.length;
    let first = str[0];
    let last = str[len];
    let ans = str.slice(1, len).join("") + first + "ay";
    if (/\W/.test(last)) {
        return last;
    }
    return ans;
}

console.log(pigIt("This is my string"));