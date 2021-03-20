function alphabetPosition(text) {
    text = text.toLowerCase();
    let ch;
    let ans = "";
    for (let i = 0; i < text.length; i++) {
        ch = text.charCodeAt(i)
        if (ch >= 97 && ch <= 122) {
            ans += ch - 96 + " ";
        }
    }
  return ans.trim();
}

let text = "The sunset sets at twelve o' clock.";

console.log(alphabetPosition(text));