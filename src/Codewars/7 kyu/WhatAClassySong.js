// code here
class Song {
  title = "";
  artist = "";
  arr = [];

  constructor(title, artist) {
    this.title = title;
    this.artist = artist;
  }
  howMany(inputArr) {
    console.log(this.arr);
    let [...set] = new Set([...inputArr, ...this.arr]);
    let newListener = set.length - this.arr.length;
    this.arr = [...set];
    console.log(this.arr);

    return newListener;
  }
}

let mountMoose = new Song("O Sanam", "Lucky Ali");
console.log(mountMoose.title);
v = mountMoose.howMany(["John", "Fred", "BOb", "carl", "RyAn", "John"]);
console.log(v);
v = mountMoose.howMany(["John", "Borna", "Raihan", "John"]);
console.log(v);

v = mountMoose.howMany(["John", "Borna", "Raihan", "KhuShal"]);
console.log(v);
