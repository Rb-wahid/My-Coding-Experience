// Always code your solution having best practices in mind
Array.prototype.sortReloaded = function (dir = "asc") {
  let arr = this.slice();
  let functions = {
    asc: (a, b) => a - b,
    desc: (a, b) => b - a,
  };

  let sortFunction = functions[dir];

  if (sortFunction) {
    return arr.sort(sortFunction);
  } else {
    return false;
  }
};
