function alphanumeric(string) {
  //your code here
    return /^[a-z\d]+$/i.test(string);
}

console.log(alphanumeric(""));