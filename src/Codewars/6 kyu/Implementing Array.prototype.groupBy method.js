Array.prototype.groupBy = function (fn) {
  return this.reduce((obj, el) => {
    let val = fn ? fn(el) : el;
    obj[val] = (obj[val] || []).concat(el);
    return obj;
  }, {});
};
