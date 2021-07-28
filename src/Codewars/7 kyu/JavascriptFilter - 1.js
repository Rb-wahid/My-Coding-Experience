function searchNames(logins) {
  const isTrue = (list) => list.some((str) => /\w+_$/.test(str));
  return logins.filter(isTrue);
}

console.log(
  searchNames([
    ["foo", "foo@foo.com"],
    ["bar_", "bar@bar.com"],
  ])
);
