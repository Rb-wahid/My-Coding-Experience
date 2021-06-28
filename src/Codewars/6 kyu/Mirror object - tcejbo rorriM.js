const mirror = (object) => {
  let obj = { ...object };
  for (let key in obj) {
    v = key.split``.reverse().join``;
    console.log(key, v, typeof v);
    obj[key] = v;
  }
  return obj;
};
