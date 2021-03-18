var encryptThis = function (text) {
  // Implement me! :)
    let arr = text.split(" ");
    let ans = "";

    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length < 3) {
            ans += arr[i].charCodeAt(0);
            if (arr[i].length === 2) {
                 ans += arr[i].substring(1);
             }
        } else {
            ans += getEncrypt(arr[i]);
        }
    }
    return ans.trim();
};

function getEncrypt(text) {
    let len = text.length - 1;
    let str = text.charCodeAt(0);
    let second = text.substring(1, 2);
    let last = text.substring(len);

    str += last + text.substring(2, len) + second;
    return str + " ";
}


let text = "Hello";

console.log(encryptThis(text));