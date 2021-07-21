// TITLES is a preloaded array of String to search throught

function search(searchTerm) {
  var search = new RegExp(searchTerm, "ig");

  return TITLES.filter(function (title) {
    search.lastIndex = 0;
    return search.test(title);
  });
}
