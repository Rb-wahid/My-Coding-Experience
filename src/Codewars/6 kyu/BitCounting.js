var countBits = function (n) {
  // Program Me
    n = n.toString(2).match(/1/g);
    return n ? n.length : 0;
};

console.log(countBits(0));