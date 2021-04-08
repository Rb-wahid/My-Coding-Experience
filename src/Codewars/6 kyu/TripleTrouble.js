function tripledouble(num1, num2) {
  //code me
    let n1 = num1.toString();
    let n2 = num2.toString();
    console.log(n1, n2);
  while (n1.length !== 0) {
    first = n1.charAt(0);
    str = n1.replace(new RegExp(`[^${first}]`, "g"), "");
    console.log(str);
    if (str.length === 3) {
      s = str.charAt(0);
      s = n2.replace(new RegExp(`[^${s}]`, "g"), "");
      if (s.length === 2) {
        return 1;
      }
    }
    n1 = n1.replace(new RegExp(`[${first}]`, "g"), "");
  }
  return 0;
}

console.log(tripledouble(666789, 123456667));
