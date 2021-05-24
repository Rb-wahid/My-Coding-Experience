function zipvalidate(postcode) {
  // ...
  let regex = /^[1-46][\d]+$/;
  return postcode.match(regex)[0].length === 6;
}

console.log(zipvalidate("424000"));

// 0, 5, 7, 8 or 9
