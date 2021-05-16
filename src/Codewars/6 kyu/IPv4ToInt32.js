function ipToInt32(ip) {
  return ip.split(".").reduce((a, b) => a * 256 + +b);
}

console.log(ipToInt32("128.32.10.1"));
