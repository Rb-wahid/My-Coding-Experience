function list(names) {
  //your code here
    let len = names.length;
    let ans = "";
    if (len > 1) {
        for (let i = 0; i < len - 2; i++) {
            ans += names[i].name + ", ";
        }
        return ans + names[len - 2].name + " & " + names[len - 1].name;
    }
}

let names = [{ name: "Bart" }, { name: "Lisa" }, { name: "Maggie" }];

console.log(list(names));