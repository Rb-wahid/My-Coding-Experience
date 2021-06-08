function evenBinary(n) {
  //Goodluck, Have Fun!

  let even = [];
  n = n.split` `;
  for (let i = 0; i < n.length; i++) {
    if (!(n[i] & 1)) {
      even.push(`00${n[i]}`.slice(-3));
      n[i] = "@";
    }
  }
  even.sort();
  for (let i = 0, j = 0; i < n.length; i++) {
    if (n[i] === "@") {
      n[i] = even[j];
      j++;
    }
  }

  return n.join` `
}

console.log(evenBinary("101 111 100 001 010"));
