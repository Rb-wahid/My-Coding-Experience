function wordsToMarks(string) {
  return [...string].reduce((sum, el) => (sum += el.charCodeAt() - 96), 0);
}

console.log(wordsToMarks("love"));
