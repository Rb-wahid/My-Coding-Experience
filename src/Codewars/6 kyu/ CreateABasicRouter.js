var Router = function () {
  this.store = [];
  this.bind = function (inputRoute, inputType, inputFunction) {
    this.obj = {};
    this.obj.route = inputRoute;
    this.obj.type = inputType;
    this.obj.fn = inputFunction;
    this.store.push(this.obj);
  };
  this.runRequest = function (inputRoute, inputType) {
    for (const index of this.store) {
      let [route, type, fn] = Object.values(index);
      if (route == inputRoute && type == inputType) {
        return fn();
      }
    }
    return "Error 404: Not Found";
  };
};
