function runningAverage() {
  let arr = [];
  return (num) => {
    arr.push(num);
    let avr = arr.reduce((sum, val) => sum + val, 0) / arr.length;
    return Number.isInteger(avr) ? avr : Number(avr.toFixed(2));
  };
}
