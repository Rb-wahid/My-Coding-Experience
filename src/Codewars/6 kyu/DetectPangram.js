function isPangram(string) {
  //...
  let regx = /\W+/g;
  let arr = [];
    string = string.replace(regx, "").toLowerCase();
  
  for (const el of string) {
    if (!arr.includes(el)) {
      arr.push(el)
    }
  }
  return arr.length === 26;
}

var string = "The quick brown fox jumps over the lazy dog.";

console.log(isPangram(string));