var WordDictionary = function () {
  this.arr = [];
};

WordDictionary.prototype.addWord = function (word) {
  //code me
  this.arr = [...this.arr, word];
};

WordDictionary.prototype.search = function (word) {
  //code me
  let regex = new RegExp(`^${word}$`);
  return this.arr.some((el) => regex.test(el));
};
