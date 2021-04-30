function stockList(listOfArt, listOfCat) {
  // ...
    let num;
    let str;
    let flag = false;
    let ans = [];
    for (const c of listOfCat) {
        num = 0;
        str = "";
        for (const b of listOfArt) {
            if (c === b.charAt(0)) {
                n = b.match(/\d+/)[0];
                num += Number(n);
            }

        }
        if (num > 0)
            flag = true;
        str = `(${c} : ${num})`
        ans.push(str);
    }

    return flag ? ans.join(" - ") : "";
}
b = ["ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"];
c = ["A", "B"];

console.log(stockList(b, c));