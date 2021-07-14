function chained(fn) {
  //FIXME
  let len = 0;
  return function (arg) {
    let temp;
    temp = arg;
    while (len !== fn.length) {
      temp = fn[len](temp);
      len++;
    }
    return temp;
  };
}
