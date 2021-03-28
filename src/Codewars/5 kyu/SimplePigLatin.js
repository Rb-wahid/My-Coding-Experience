function pigIt(str) {
  return str.replace(/(\w)(\w*)/g, "$2$1ay");
}

console.log(pigIt("This is my string"));
