function convert(str) {
    let ans = str.toLowerCase();
  let replace = (s, d) => ans.replace(new RegExp(s, "g"), d);
  let set = new Set(ans.split``);
  let i = 1;
  let j = 0;

    for (const el of set) {
    if (i === 1) {
      ans = replace(el, i);
      i = 0;
    } else if (j === 0) {
      ans = replace(el, j);
      j++;
    } else {
      ++j;
      ans = replace(el, j);
    }
  }

  return Number(ans);
}
console.log(convert("wctboaBBbFtjWFT"));
