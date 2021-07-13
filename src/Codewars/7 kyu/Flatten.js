var flatten = function (array) {
  // TODO: Program me
  let rst = [];
  for (const v of array) {
    if (Array.isArray(v)) {
      rst.push(...v);
    } else {
      rst.push(v);
    }
  }
  return rst;
};
