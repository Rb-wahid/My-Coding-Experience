function bouncingBall(h, bounce, window) {
  let count = -1;
  if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
    while (h > window) {
      h *= bounce;
      count += 2;
    }
  }
  return count;
}

console.log(bouncingBall(30, 0.66, 1.5));
