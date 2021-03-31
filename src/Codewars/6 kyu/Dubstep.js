function songDecoder(song) {
  // ...
    return song.replace(/(WUB)+/g, " ");
}
let song = "AWUBBWUBC";
console.log(songDecoder(song));