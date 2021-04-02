function domainName(url) {
  //your code here
    url = url.split(".com")[0];
    let lastIndex = url.lastIndexOf(".");
    let last = url.lastIndexOf("/");
    console.log(last);
    return lastIndex !== -1 ? str(url, lastIndex) : str(url, last);
}

function str(url, i) {
    return url.substring(i+1)
}

console.log(domainName("http://github.com/carbonfive/raygun"));
