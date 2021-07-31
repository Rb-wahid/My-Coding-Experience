function willFit(present, box) {
  let presentSorted = present.sort((a, b) => a - b);
  let boxSorted = box.sort((a, b) => a - b);
  return presentSorted.every((p, i) => boxSorted[i] > p + 1);
}
