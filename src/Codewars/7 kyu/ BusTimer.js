function busTimer(time) {
  let [h, m] = time.split(":").map(Number);
  let t = (h * 60 + m + 5) % 1440;
  let mod = t > 360 ? 15 : 360;

  return (mod - (t % mod)) % mod;
  console.log(h, t);
}

console.log(busTimer("23:56"));
