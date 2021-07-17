function once(fn) {
  let isExecuted = false;
  return function(...arg){
    if(!isExecuted) {
      isExecuted = true;
      return fn(...arg);
    } else {
      return undefined;
    }
  }
}