function NamedOne(first, last) {
  // -- SHOULD be changed --
  const setFullName = (first, last, fullname = " ") => {
    let name = fullname.split(" ");
    if (first == false) {
      return name[0] + " " + last;
    } else if (last == false) {
      return first + " " + name[1];
    } else {
      return first + " " + last;
    }
  };
  let firstName = first;
  let lastName = last;
  let fullName = setFullName(first, last);

  Object.defineProperty(this, "firstName", {
    get: function () {
      return firstName;
    },
    set: function (first) {
      firstName = first;

      fullName = setFullName(first, false, fullName);
    },
  });

  Object.defineProperty(this, "lastName", {
    get: function () {
      return lastName;
    },
    set: function (last) {
      lastName = last;

      fullName = setFullName(false, last, fullName);
    },
  });

  Object.defineProperty(this, "fullName", {
    get: function () {
      return fullName;
    },
    set: function (name) {
      name = name.split(" ");

      if (name.length == 2) {
        fullName = name[0] + " " + name[1];
        firstName = name[0];
        lastName = name[1];
      }
    },
  });
}
