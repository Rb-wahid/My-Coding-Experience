function discoverOriginalPrice(discountedPrice, salePercentage) {
  // ...
  let p = 1 - (salePercentage / 100);
  return (discountedPrice / p).toFixed(2);
}

console.log(discoverOriginalPrice(75.75, 25));
