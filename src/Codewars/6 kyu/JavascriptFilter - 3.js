function searchNames(logins) {
  return logins.filter((str, idx, arr) => {
    if (
      (idx & 1) == 1 &&
      (arr[idx - 1].startsWith(".") || arr[idx - 1].endsWith("."))
    ) {
      return true;
    }
  });
}

var a = ["foo", "foo@foo.com", "bar.", "bar@bar.com"];
console.log(searchNames(a));
