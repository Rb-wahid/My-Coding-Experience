function inArray(arr1, arr2) {
  return arr1.filter((el1) => arr2.find((el2) => el2.match(el1))).sort();
}

let a = ["live", "strong", "arp"];
let b = ["lively", "alive", "harp", "sharp", "armstrong"];

console.log(inArray(a, b));
