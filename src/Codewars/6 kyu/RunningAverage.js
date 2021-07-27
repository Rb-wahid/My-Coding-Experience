function runningAverage() {
  let sum = 0;
  let items = 0;
  return (num) => {
    items += 1;
    sum += num;

    return Math.round((sum / items) * 100) / 100;
  };
}
