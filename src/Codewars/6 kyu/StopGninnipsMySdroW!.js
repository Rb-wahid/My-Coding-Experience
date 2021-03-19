function spinWords(text) {
  return text
    .split(" ")
    .map((word) =>
      word.length >= 5 ? word.split("").reverse().join("") : word
    )
    .join(" ");
}

let text = "Hey fellow warriors";

console.log(spinWords(text));