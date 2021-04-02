function bouncingBall(h, bounce, window) {
    if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
        let current = h * bounce;
        let count = 1;

        while (current > window) {
            current *= bounce;
            count += 2;
        }
        return count;
  }
  return -1;
}

console.log(bouncingBall(30, 0.66, 1.5));
