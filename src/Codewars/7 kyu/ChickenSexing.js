function correctness(bD, eD) {
  const isDoubt = (str) => str == "?";
  const getPoint = (i) =>
    bD[i] == eD[i] ? 1 : isDoubt(bD[i]) || isDoubt(eD[i]) ? 0.5 : 0;
  return bD.reduce((res, curr, idx) => res + getPoint(idx), 0);
}
