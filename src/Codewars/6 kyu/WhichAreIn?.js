function inArray(array1, array2) {
    let arr = [];

    for (let i = 0; i < array1.length; i++) {
        if (isPresent(array1[i], array2))
            arr.push(array1[i]);
    }

    return arr;
}

function isPresent(str, arr) {
    
  for (let i = 0; i < arr.length; i++) {
      if (arr[i].includes(str))
          return true;
  }
    return false;
}

let a = ["tarp", "mice", "bull"];
let b = ["lively", "alive", "harp", "sharp", "armstrong"];


console.log(inArray(a, b));
