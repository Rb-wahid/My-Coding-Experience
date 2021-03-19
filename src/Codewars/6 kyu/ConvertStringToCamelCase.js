function toCamelCase(str) {
    let regex = /[-|_]\w/ig;;

    return str.replace(regex, function(match) {
        return match.charAt(1).toUpperCase();
    } )
}

let text = "the-stealth_warrior";

console.log(toCamelCase(text));