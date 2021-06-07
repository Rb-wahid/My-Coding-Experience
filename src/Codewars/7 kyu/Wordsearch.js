function wordSearch(word, text) {
  return new RegExp(word, "g").test(text);
}
const myText =
  "what makes the desert beautiful, said the little prince is that somewhere it hides a well";

console.log(wordSearch("desert", myText));
