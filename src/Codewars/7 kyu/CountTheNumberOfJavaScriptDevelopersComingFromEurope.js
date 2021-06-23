function countDevelopers(list) {
  // your awesome code here :)
  let count = list.filter(
    (item) => item.continent == "Europe" && item.language == "JavaScript"
  ).length;
  return count;
}
