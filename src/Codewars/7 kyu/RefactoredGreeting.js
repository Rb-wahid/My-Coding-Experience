function Person(myName) {
  this.name = myName;
}

Person.prototype.greet = function (urName) {
  return "Hello " + urName + ", my name is " + this.name;
};
