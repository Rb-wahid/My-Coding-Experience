function well(x) {
  let match = ("" + x).match(/good/gi) || [];
  let len = match.length;
  return len > 2 ? "I smell a series!" : len > 0 ? "Publish!" : "Fail!";
}

console.log(
  well([
    ["gOOd", "bad", "BAD", "bad", "bad"],
    ["bad", "bAd", "bad"],
    ["GOOD", "bad", "bad", "bAd"],
  ])
);
