function toWeirdCase(string) {
  return string
    .split(" ")
    .map((world) => {
      return world
        .split("")
        .map((letter, idx) =>
          (idx & 1) === 0 ? letter.toUpperCase() : letter.toLowerCase()
        )
        .join("");
    })
    .join(" ");
}
console.log(toWeirdCase("Weird string case"));
