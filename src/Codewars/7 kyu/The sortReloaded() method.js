// Always code your solution having best practices in mind
Array.prototype.sortReloaded = function (dir) {
  let arr = this.slice();
  if (dir == undefined || dir == "asc") {
    return arr.sort((a, b) => a - b);
  } else if (dir == "desc") {
    return arr.sort((a, b) => b - a);
  } else {
    return false;
  }
};
