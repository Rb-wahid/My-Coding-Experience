function makeSentence(parts) {
  // TODO
  parts = parts.join(" ") + ".";
  return parts
    .replace(/\s[,.]/g, (el) => (el === " ," ? "," : "."))
    .replace(/[.]+/g, ".");
}

console.log(makeSentence(["hello", ",", "my", "dear"]));
