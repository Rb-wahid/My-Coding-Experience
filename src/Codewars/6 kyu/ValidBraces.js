function validBraces(braces) {
  //TODO
    let regex = /(\(\))|(\{\})|(\[\])/;

    while (regex.test(braces)) {
        braces = braces.replace(regex, "")
    }

    return !braces;
}

let braces = "([{}])";

console.log(validBraces(braces));