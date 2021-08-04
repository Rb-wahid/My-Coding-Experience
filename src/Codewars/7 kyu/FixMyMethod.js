function myFunction() {
  return {
    objMethod: function () {
      return "string";
    },
  };
}

console.log(myFunction().objMethod());
