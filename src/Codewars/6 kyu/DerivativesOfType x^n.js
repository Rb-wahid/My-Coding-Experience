function differentiate(x) {
  let flag = x.charAt(0) == "-" ? -1 : 1;
  if (!/[\^]/.test(x)) {
    if (/[-x]$/.test(x))
      return !/\d/.test(x) ? x.replace(/x/, "1") : x.replace(/x/, "");
    if (/\d/.test(x)) return "0";
  } else {
    let n = x.split("^");
    let a = x.split("x")[0];
    n = n[n.length - 1];
    a = /\d/.test(a) ? a : flag;
    let mul = n * a;
    mul = mul === -1 ? "-" : mul === 1 ? "" : mul;
    return n - 1 != 1 ? `${mul}x^${n - 1}` : `${mul}x`;
  }
}

console.log(differentiate("x^-1"));
