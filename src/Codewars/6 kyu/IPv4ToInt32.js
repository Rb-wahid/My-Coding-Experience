function ipToInt32(ip) {
  return ip
    .split(".")
    .reverse()
    .map((a, i) => a * Math.pow(256, i))
    .reduce((a, b) => a + b);
}

console.log(ipToInt32("128.32.10.1"));
