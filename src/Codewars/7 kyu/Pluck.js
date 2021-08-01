function pluck(objs, name) {
  let rst = [];
  objs.forEach((obj) => {
    if (Object.hasOwnProperty.call(obj, name)) {
      rst.push(obj[name]);
    } else {
      rst.push(undefined);
    }
  });
  return rst;
}

console.log(pluck([{ a: 1, b: 3 }, { a: 2 }], "b"));
