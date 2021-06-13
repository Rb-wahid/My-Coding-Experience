function parseHTMLColor(color) {
  if (!/#/.test(color)) color = PRESET_COLORS[color.toLowerCase()];

  if (color.length == 4) {
    color = color.replace(/(\w)/g, (el) => el + el);
  }
  let arr = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(color);
  let ans = arr.map((el) => parseInt(el, 16));
  ans.shift();

  return { r: ans[0], g: ans[1], b: ans[2] };
}

console.log(parseHTMLColor("#fff"));
