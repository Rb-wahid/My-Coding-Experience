function willFit(present, box) {
  console.log(present, box);
  present = present.sort();
  box = box.map((b) => b - 1).sort();
  console.log(present, box);
  return present.every((p, i) => box[i] > p);
}
