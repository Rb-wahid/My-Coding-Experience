Object.deepFreeze = function (obj) {
  Object.freeze(obj);

  for (const prop in obj) {
    Object.deepFreeze(obj[prop]);
  }
};
