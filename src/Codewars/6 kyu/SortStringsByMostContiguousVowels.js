function sortStringsByVowels(strings) {
  const maxLen = (str) =>
    Math.max(...(str.match(/[aeiou]+/gi) || []).map((r) => r.length));

  return strings.sort((a, b) => maxLen(b) - maxLen(a));
}

console.log(sortStringsByVowels(["every", "bataux", "is", "waaaay", "loose"]));
