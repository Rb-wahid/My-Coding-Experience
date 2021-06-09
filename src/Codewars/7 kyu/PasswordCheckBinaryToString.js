function decodePass(passArr, bin) {
  // Code here
  let ans = bin.split` `.map((bin) => String.fromCharCode(parseInt(bin, 2)));

  return passArr.includes(ans.join``) ? ans.join`` : false;
}

console.log(
  decodePass(
    ["password123", "admin", "admin1"],
    "01110000 01100001 01110011 01110011 01110111 01101111 01110010 01100100 00110001 00110010 00110011"
  )
);
