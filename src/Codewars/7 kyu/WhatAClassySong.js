class Song {
  title = "";
  artist = "";
  arr = [];

  constructor(title, artist) {
    this.title = title;
    this.artist = artist;
  }

  howMany(arr) {
    let inputArr = arr.map((el) => el.toLowerCase());
    let [...set] = new Set([...inputArr, ...this.arr]);
    let newListener = set.length - this.arr.length;
    this.arr = [...set];

    return newListener;
  }
}
