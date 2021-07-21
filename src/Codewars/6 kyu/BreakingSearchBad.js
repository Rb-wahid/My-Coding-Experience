// TITLES is a preloaded array of String to search throught

function search(searchTerm) {
  var search = new RegExp(searchTerm, "i");

  return TITLES.filter(function (title) {
    return search.test(title);
  });
}
