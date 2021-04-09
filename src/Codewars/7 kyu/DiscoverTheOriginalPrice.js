function discoverOriginalPrice(discountedPrice, salePercentage) {
  // ...
  let p = 1 - (salePercentage / 100);
  let ans = (discountedPrice / p);
  return parseInt(ans) === ans ? ans : Number(ans.toFixed(2));
}

console.log(discoverOriginalPrice(75.75, 25));
