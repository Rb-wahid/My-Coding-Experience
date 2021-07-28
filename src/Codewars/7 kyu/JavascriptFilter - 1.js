function searchNames(logins) {
  return logins.filter((list) => list[0].endsWith("_"));
}

console.log(
  searchNames([
    ["foo", "foo@foo.com"],
    ["bar_", "bar@bar.com"],
  ])
);
