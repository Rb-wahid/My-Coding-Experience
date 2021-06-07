function wordSearch(word, text) {
  let reg = new RegExp(`\\b${word}\\b`, "g");
  return reg.test(text);
}
const myText =
  "what makes the desert beautiful, said the little prince is that somewhere it hides a well";

console.log(wordSearch("prince", myText));
