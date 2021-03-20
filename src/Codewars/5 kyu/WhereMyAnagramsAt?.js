function anagrams(word, words) {
  word = word.split("").sort().join("");
  let arr = [];

  for (let i = 0; i < words.length; i++) {
    if (words[i].split("").sort().join("") === word) {
      arr.push(words[i]);
    }
  }
  return arr;
}

let str = "abba";
let arr = ["aabb", "abcd", "bbaa", "dada"];

console.log(anagrams(str, arr));
