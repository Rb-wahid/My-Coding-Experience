Object.prototype.hash = function (string) {
  let key = string.split(".");
  let ans = this[key[0]];
  while (true) {
    if (!ans) {
      break;
    }
    key.shift();
    if (key.length == 0) {
      break;
    }

    ans = ans[key[0]];
  }

  return ans;
};
