function isValidWalk(walk) {
  let count = 0;
  if (walk.length === 10) {
    for (const i of walk) {
      if (i === "n") {
        count++;
      } else if (i === "s") {
        count--;
      } else if (i === "e") {
        count += 2;
      } else {
        count -= 2;
      }
    }
    return count === 0;
  }
  return false;
}
