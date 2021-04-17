function calcFuel(n) {
  // your code here
  let t = n * 11;
  let obj1 = { lava: 800, blazeRod: 120, coal: 80, wood: 15, stick: 1 };
  let obj2 = { lava: 0, blazeRod: 0, coal: 0, wood: 0, stick: 0 };

  for (const key in obj1) {
    obj2[key] = Math.floor(t / obj1[key]);
    t %= obj1[key];
  }
  return obj2;
}

console.log(calcFuel(123));
