function getHashtags(post) {
  // Add logic here
  post = post.split(" ");
  post = post.filter((x) => /#/.test(x));
  if ((post[0].length === 1) | (post[0].charAt(0) !== "#")) return [];
  else {
    post = post.join("");
    post = post.match(/[a-z]+/gi);
    // let str = post.match(/[a-z]+/ig).join("")
    //  console.log([str]);
    return post ? post.join("") : [];
  }
}

let post = "#sorryNotSorry";

console.log(getHashtags(post));
