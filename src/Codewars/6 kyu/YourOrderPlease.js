function order(words) {
  // ...
    let arr = words.split(" ");
    
    for (let i = 0; i < arr.length; i++) {
        arr[i] = findInt(arr[i]) + arr[i].substring(0);
     }
    arr.sort();

    for (let i = 0; i < arr.length; i++) {
       arr[i] = arr[i].substring(1);
     }
    
    return arr.join(" ");
}


function findInt(str) {

return str.match(/\d/)[0];
}

let str = "4of Fo1r pe6ople g3ood th5e the2";

console.log(order(str));
