function wave(str) {
  // Code here
    let arr = [];
    let s;
    let second;
    let len = str.length;

    for (let i = 0; i < len; i++) {
        second = i < len ? i + 1 : len - 1;
        s = "";
        s =
          str.substring(0, i) +
          str.substring(i, second).toUpperCase() +
          str.substring(second); 

         arr.push(s);
    }

    return arr;
}

let str = "hello";

console.log(wave(str));