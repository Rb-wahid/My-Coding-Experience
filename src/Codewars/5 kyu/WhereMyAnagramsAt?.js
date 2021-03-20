function anagrams(word, words) {
    return words.filter(x => x.sort() === word.sort());
}

String.prototype.sort = function () {
    return this.split("").sort().join("");
}

let str = "abba";
let arr = ["aabb", "abcd", "bbaa", "dada"];

console.log(anagrams(str, arr));
