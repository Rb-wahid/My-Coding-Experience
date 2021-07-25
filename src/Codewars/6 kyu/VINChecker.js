const checkVin = (vin) => {
  // Your code here
  if (vin.length != 17 || /[IOQ]/.test(vin)) {
    return false;
  }

  let W = [8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2];

  let productSum = [...vin]
    .map((el, i) => {
      if (isNaN(el)) {
        let num = el.charCodeAt() - 64;
        let mod;
        if (num > 18) {
          mod = num % 9;
          mod++;
        } else {
          mod = num % 9;
          mod = mod == 0 ? 9 : mod;
        }
        return mod * W[i];
      } else {
        return Number(el) * W[i];
      }
    })
    .reduce((sum, val) => sum + val, 0);

  let modulus = productSum % 11;
  return modulus == 10 ? vin[8] == "X" : vin[8] == modulus;
};

console.log(checkVin("5YJ3E1EA7HF000337"));
