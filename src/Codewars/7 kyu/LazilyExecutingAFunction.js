var make_lazy = function (fn, ...v) {
  // TODO: implement this function
  return () => fn(...v);
};
