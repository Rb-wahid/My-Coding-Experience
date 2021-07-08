function separateLiquids(glass) {
  let o = [];
  let a = [];
  let w = [];
  let h = [];

  glass.forEach((liqs) => {
    liqs.forEach((liq) => {
      if (liq == "O") o.push(liq);
      else if (liq == "A") a.push(liq);
      else if (liq == "W") w.push(liq);
      else h.push(liq);
    });
  });
  let allArr = [...o, ...a, ...w, ...h];
  let j = 0;

  for (const m in glass) {
    for (const n in glass[m]) {
      console.log(m, n);
      glass[m][n] = allArr[j];
      j++;
    }
  }

  return glass;
}

console.log(
  separateLiquids([
    ["H", "H", "W", "O"],
    ["W", "W", "O", "W"],
    ["H", "H", "O", "O"],
  ])
);
