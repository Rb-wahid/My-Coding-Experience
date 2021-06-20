function well(x) {
  let good = [];
  x.map((a) => {
    let arr = a.filter((el) => /good/i.test(el));
    good.push(...arr);
  });

  let len = good.length;

  return len > 2 ? "I smell a series!" : len > 0 ? "Publish!" : "Fail!";
}

console.log(
  well([
    ["gOOd", "bad", "BAD", "bad", "bad"],
    ["bad", "bAd", "bad"],
    ["GOOD", "bad", "bad", "bAd"],
  ])
);
