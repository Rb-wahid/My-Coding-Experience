Array.prototype.groupBy = function (fn) {
  fn = fn ? fn : (n) => n;

  let obj = {};

  this.forEach((el) => {
    let val = fn(el);
    obj[val] = [].concat(obj[val] || [], el);
  });
  return obj;
};


