function vodkaConsumption(shots) {
  //sip!
  let op = (el) => {
    let regMl = /ml/;
    let regL = /l/;

    if (regMl.test(el)) return +el.replace(regMl, "") / 1000;
    else return +el.replace(regL, "");
  };
  let sum = 0;
  shots.map((a) => (sum += op(a)));
  return `${Math.round(sum)}l`;
}
