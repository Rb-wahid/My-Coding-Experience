function duplicateEncode(word) {
  // ...
    word = word.toLowerCase().split("");
    let ans = [];
    let dupli = [];
    let flag;

    for (let i = 0; i < word.length; i++) {
      flag = true;
      for (let index = 0; index < word.length; index++) {
        if (i !== index && word[i] === word[index]) {
          flag = false;
        }
      }
      if (flag) {
        ans.push("(");
      } else {
        ans.push(")");
      }
    }
    return ans.join("");
    
}

console.log(duplicateEncode("Success"));
