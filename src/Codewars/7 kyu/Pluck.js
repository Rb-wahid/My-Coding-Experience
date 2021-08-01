function pluck(objs, name) {
  return objs.map((obj) => obj[name]);
}

console.log(pluck([{ a: 1, b: 3 }, { a: 2 }], "b"));
