function convert(s) {
    return s.split``.map(a => a.charCodeAt()).join``;
}

console.log(convert("KATA"));