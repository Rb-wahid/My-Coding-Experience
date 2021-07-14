function chained(fn) {
  //FIXME
  return function (arg) {
    return fn.reduce((result, func) => func(result), arg);
  };
}
