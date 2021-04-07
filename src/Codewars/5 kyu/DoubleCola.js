function whoIsNext(names, r) {
    let lineLen = names.length;
    let eachPeople = 1;

    while (r > lineLen) {
        r -= lineLen;
        eachPeople *= 2;
        lineLen *= 2;
    }

    return names[Math.floor((r-1)/ eachPeople) % lineLen];
}

console.log(
  whoIsNext(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 7230702951)
);
