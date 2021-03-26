function hexStringToRGB(hexString) {
    let r = parseInt(hexString.substring(1, 3), 16);
    let g = parseInt(hexString.substring(3, 5), 16);
    let b = parseInt(hexString.substring(5, 7), 16);

    return { r: r, g: g, b: b };
}

let hexString = "#FF9933";
console.log(hexStringToRGB(hexString));

console.log(parseInt("FF", 16));