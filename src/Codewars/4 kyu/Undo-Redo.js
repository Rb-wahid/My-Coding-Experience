function undoRedo(object) {
  let obj = { ...object };
  let prev = [];
  let isDel = false;
  let isSet = false;
  let isUndo = false;
  let isUndoSet = false;
  let isUndoDel = false;
  let redoArr = [];
  return {
    set: function (key, value) {
      isSet = true;
      isDel = false;
      prev.push(key);
      prev.push(value);

      obj[key] = value;
    },
    get: function (key) {
      return obj[key];
    },
    del: function (key) {
      isDel = true;
      isSet = false;
      prev.push(key);
      prev.push(obj[key]);

      delete obj[key];
    },
    undo: function () {
      if (isSet || isDel) {
        isUndo = true;
        if (isSet) {
         redoArr.push(...prev);
          this.del(prev[0]);
          prev.length = 0;
          isSet = false;
          isUndoSet = true;
        }
        if (isDel) {
          console.log("isDel prev ", prev);
          redoArr.push(...prev);
          this.set(prev[0], prev[1]);
          prev.length = 0;
          isDel = false;
          isUndoDel = true;
        }
      } else throw "error";
    },
    redo: function () {
      if (isUndo) {
        if (isUndoDel) {
          console.log("undo delete", redoArr);
          this.del(redoArr[0]);
          redoArr.length = 0;
          isUndoDel = false;
        }
        if (isUndoSet) {
          this.set(redoArr[0], redoArr[1]);
          redoArr.length = 0;
          isUndoSet = false;
        }
        isUndo = false;
      } else throw "error";
    },
    op: function () {
      console.log(obj);
    }
  };
}

var obj = {
  x: 1,
  y: 2,
};

var unRe = undoRedo(obj);
// unRe.set("z", 5);
// console.log(unRe.get("z"));
// unRe.del('z')
//
//console.log("set " + unRe.get("x"));
unRe.op();
unRe.del("x");

console.log("After del ");
unRe.op();
unRe.undo();
console.log("After undo ");
unRe.op();
unRe.redo();
console.log("After redo ");
unRe.op();
