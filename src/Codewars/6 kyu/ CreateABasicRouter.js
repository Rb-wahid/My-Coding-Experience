class Router {
  constructor() {
    this.routes = new Map();
    this.error = "Error 404: Not Found";
  }

  bind(path, method, action) {
    this.routes.set(`${path}:${method}`, action);
  }

  runRequest(path, method) {
    try {
      return this.routes.get(`${path}:${method}`)();
    } catch (e) {
      return this.error;
    }
  }
}
