function chirp(n) {
    if(n === 1)
        return "chirp";
    else
        return "chirp-" + chirp(n - 1);
}

console.log(chirp(2));