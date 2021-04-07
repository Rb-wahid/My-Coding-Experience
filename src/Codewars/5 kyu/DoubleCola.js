function whoIsNext(names, r) {
  let l = names.length;
  while (r >= l) {
    r -= l;
    l *= 2;
  }

  return names[Math.ceil((names.length * r) / l) - 1];
}

console.log(
  whoIsNext(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 7230702951)
);
