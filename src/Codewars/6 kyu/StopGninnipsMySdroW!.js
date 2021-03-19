function spinWords(text) {
  //TODO Have fun :)
    let array = text.split(" ");
    let ans = "";
    let len;
    for (let i = 0; i < array.length; i++) {
         len = array[i].length;
        if (len >= 5) {
            ans += array[i].split("").reverse().join("");
        } else {
            ans += array[i];
        }

        ans += " ";
    }
    return ans.trim();
}

let text = "Hey fellow warriors";

console.log(spinWords(text));