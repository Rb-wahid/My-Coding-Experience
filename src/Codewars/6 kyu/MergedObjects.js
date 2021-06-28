var objConcat = (o) => {
  let all = {};
  for (const el of o) {
    for (const key in el) {
      all[key] = el[key];
    }
  }

  return all;
};

console.log(objConcat(o));
