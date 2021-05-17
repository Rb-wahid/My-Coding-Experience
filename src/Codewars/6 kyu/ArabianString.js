function camelize(str) {
  //...
  let strChange = (s) =>
    s.charAt(0).toUpperCase() + s.substring(1).toLowerCase();

  str = str.split(/[\W_]/);

  return str.map((s) => strChange(s)).join``;
}

console.log(camelize("your-NaMe-here"));
