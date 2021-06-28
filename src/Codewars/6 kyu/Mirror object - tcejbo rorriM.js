const mirror = (obj) => {
    return Object.keys(obj).reduce((newObj, key) => {
        newObj[key] = key.split``.reverse().join``;
        return newObj;
  },{})
};
