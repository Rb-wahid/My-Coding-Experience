function isValidWalk(walk) {
    let count = 0;
    if (walk.length === 10) {
      for (const i of walk) {
        if (i === "n") {
          count++;
        } else if (i === "s") {
          count--;
        } else if (i === "e") {
          count++;
        } else {
          count--;
        }
      }
      return count === 0;
    }
    return false;
}


let arr = ["n", "s", "n", "s", "n", "s", "n", "s", "n", "s"];
let arr2 = ["w", "e", "w", "e", "w", "e", "w", "e", "w", "e", "w", "e"];
let arr3 = ["n", "n", "n", "s", "n", "s", "n", "s", "n", "s"]; 


console.log(isValidWalk(arr));
console.log(isValidWalk(arr2));
console.log(isValidWalk(arr3));
