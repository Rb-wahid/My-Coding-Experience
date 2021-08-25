function bump(x) {
  let bumps = [...x].filter((el) => el == "n").length;
  return bumps <= 15 ? "Woohoo!" : "Car Dead";
}
