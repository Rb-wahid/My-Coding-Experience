function list(names) {
  //your code here
    return names.reduce((prev, present, index, arr) => {
        if (index === 0)
            return present.name;
        else if (index === arr.length - 1)
            return prev + " & " + present.name;
        else
            return prev + ", " + present.name;
    }, "");
}

let names = [{ name: "Bart" }, { name: "Lisa" }, { name: "Maggie" }];

console.log(list(names));