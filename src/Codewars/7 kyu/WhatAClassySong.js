class Song {
  constructor(title, artist) {
    this.title = title;
    this.artist = artist;
    this.listener = new Set();
  }

  howMany(pepple) {
    let oldListener = this.listener.size;
    pepple.forEach((pep) => this.listener.add(pep.toLowerCase()));
    let totalListener = this.listener.size;
    return totalListener - oldListener;
  }
}
