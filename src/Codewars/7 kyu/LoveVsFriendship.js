function wordsToMarks(string) {
  //your code here
  let sum = 0;

  return string.split``
    .map((el) => el.charCodeAt() - 96)
    .reduce((a, b) => a + b);
}

console.log(wordsToMarks("love"));
