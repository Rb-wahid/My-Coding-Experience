function convert(str) {
  let ans = str;
  let replace = (s, d) => ans.replace(new RegExp(s, "g"), d);
  let set = new Set(str.split``);
  let i = 0;

  set.forEach((el) => (ans = replace(el, ++i)));

  return ans;
}
console.log(convert("KATA"));
