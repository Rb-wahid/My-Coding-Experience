function compose(...arguments) {
  // Your solution
  let arr = arguments
  return function (arg){
    return arr.reverse().reduce((res, curr) =>  curr(res) , arg)
  }
}