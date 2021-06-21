function regexContainsAll(str) {
  return str.replace(/./g, "(?=.*$&)");
}
