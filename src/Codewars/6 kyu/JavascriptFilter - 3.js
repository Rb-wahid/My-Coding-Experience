function searchNames(logins) {
  return logins
    .map((list, idx, arr) => {
      if (list.endsWith(".") || list.startsWith(".")) {
        return arr[idx + 1];
      }
    })
    .filter((list) => list != undefined);
}

var a = ["foo", "foo@foo.com", "bar.", "bar@bar.com"];
console.log(searchNames(a));
