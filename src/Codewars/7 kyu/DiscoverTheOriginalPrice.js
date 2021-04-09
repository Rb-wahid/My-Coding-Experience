function discoverOriginalPrice(discountedPrice, salePercentage) {
  return +(discountedPrice / (1 - salePercentage / 100)).toFixed(2);
}

console.log(discoverOriginalPrice(75.75, 25));
