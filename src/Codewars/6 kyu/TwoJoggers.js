var nbrOfLaps =  (x, y) => {
    let lapX = 1;
    let lapY = 1;
    let a, b;
    while (lapX * x !== lapY * y) {
        a = lapX * x;
        b = lapY * y;
        if (a > b) {
            lapY++;
        } else if (a < b) {
            lapX++;
        }
    }
  return [lapX, lapY];
};

console.log(nbrOfLaps(5, 3));