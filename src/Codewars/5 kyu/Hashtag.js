function getHashtags(post) {
  return post
    .split(/\s/)
    .filter((element) => {
      if ((element.match(/^(#+)\w+$/) || []).length) {
        return true;
      }
      return false;
    })
    .map((element) => {
      return element.replace(/#/g, "");
    });
}

let post = "#sorryNotSorry";

console.log(getHashtags(post));
