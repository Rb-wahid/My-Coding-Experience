function NamedOne(first, last) {
  // -- SHOULD be changed --
  this.firstName = first;
  this.lastName = last;

  Object.defineProperty(this, "fullName", {
    get: function () {
      return this.firstName + " " + this.lastName;
    },
    set: function (name) {
      if (/\w+\s\w+/.test(name)) {
        [this.firstName, this.lastName] = name.split(" ");
      }
    },
  });
}
