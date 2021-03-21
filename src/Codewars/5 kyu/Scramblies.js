function scramble(str1, str2) {
  //code me
    let flag = true;
    for (const el of str2) {
        if (!str1.match(new RegExp(el, "gi"))) {
            flag = false;
            break;
        }
    }
    return flag;
}
let str1 = "rkqodlw";
let str2 = "world";

console.log(scramble(str1, str2));