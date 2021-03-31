function songDecoder(song) {
  // ...
    return song.replace(/(WUB)+/g, " ").trim();
}
let song = "AWUBBWUBC";
console.log(songDecoder(song));