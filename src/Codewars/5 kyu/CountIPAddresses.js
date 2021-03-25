function ipsBetween(start, end) {
  //TODO
    return ipToNum(end) - ipToNum(start);
}

function ipToNum(ip) {
    return ip.split(".").reduce((sum, v) => sum << 8 | v, 0) >>> 0;
}

console.log(ipsBetween("10.0.0.0", "10.0.0.50"));