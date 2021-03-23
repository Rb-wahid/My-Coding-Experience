function alphanumeric(string) {
  //your code here
    let regx = /[^a-z0-9]/gi;
    let str = string.match(regx);
    
    return !string || str ? false : true;
}

console.log(alphanumeric(""));