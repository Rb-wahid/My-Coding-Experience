function vaporcode(string) {
  string = string.replace(/\s/g, "").toUpperCase();

  return [...string].join("  ");
}
