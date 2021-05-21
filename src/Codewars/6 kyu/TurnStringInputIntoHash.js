function strToHash(str) {
  // ...
  let ans = "";

  ans = str.split` `.map((el) => {
    el = el.replace(",", "").split`=`;
    return `'${el[0]}': ${Number(el[1])}`;
  });

  return `{ ${ans.join`, `} }`;
}

console.log(strToHash("a=1, b=2, c=3, d=4"));
