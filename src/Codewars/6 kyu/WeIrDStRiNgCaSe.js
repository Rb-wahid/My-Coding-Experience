function toWeirdCase(string) {
  //TODO
  return string
    .split(" ")
    .map((el) => {
      let s = "";
      for (const key in el) {
        if ((key & 1) === 0) {
          s += el.charAt(key).toUpperCase();
        } else s += el.charAt(key);
      }
      return s;
    })
    .join(" ");
}
console.log(toWeirdCase("Weird string case"));
