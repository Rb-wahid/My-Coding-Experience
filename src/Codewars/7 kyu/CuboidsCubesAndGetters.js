class Cuboid {
  // TODO: Program Me
  constructor(length, width, height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  get surfaceArea() {
    let l = this.length;
    let w = this.width;
    let h = this.height;
    return 2 * l * w + 2 * l * h + 2 * h * w;
  }

  get volume() {
    let l = this.length;
    let w = this.width;
    let h = this.height;
    return w * h * l;
  }
}
class Cube extends Cuboid {
  // Don't forget to make a call to super ;)
  constructor(length) {
    super(length, length, length);
  }
}
