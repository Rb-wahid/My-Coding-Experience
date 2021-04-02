function titleCase(title, minorWords) {
  if (typeof minorWords === "undefined") {
    return title
      .toLowerCase()
      .split(" ")
      .map((a) => TCase(a))
      .join(" ");
  }
  minorWords = minorWords.toLowerCase().split(" ");
  return title
    .toLowerCase()
    .split(" ")
    .map((a, idx) =>
      idx === 0 ? TCase(a) : !minorWords.includes(a) ? TCase(a) : a
    )
    .join(" ");
}

function TCase(a) {
  return a.charAt(0).toUpperCase() + a.substring(1);
}

console.log(titleCase("THE WIND IN THE WILLOWS", "The In"));
