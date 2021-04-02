function domainName(url) {
  return url
    .replace("http://", "")
    .replace("https://", "")
    .replace("www.", "")
    .split("/[/?#]/")[0]
    .split(".")[0];
}
console.log(domainName("http://github.com/carbonfive/raygun"));
