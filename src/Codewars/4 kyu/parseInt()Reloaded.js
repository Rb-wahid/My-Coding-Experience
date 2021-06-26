function parseInt(string) {
  // TODO: it's your task now
  string = string.replace(/\band\b/g, "").replace(/\s\s/, " ");
  console.log(string);
  let obj = {
    zero: 0,
    one: 1,
    two: 2,
    three: 3,
    four: 4,
    five: 5,
    six: 6,
    seven: 7,
    eight: 8,
    nine: 9,
    ten: 10,
    eleven: 11,
    twelve: 12,
    thirteen: 13,
    fourteen: 14,
    fifteen: 15,
    sixteen: 16,
    seventeen: 17,
    eighteen: 18,
    nineteen: 19,
    twenty: 20,
    thirty: 30,
    forty: 40,
    fifty: 50,
    sixty: 60,
    seventy: 70,
    eighty: 80,
    ninety: 90,
  };

  const digit = (str) => {
    let temp;
    if (/[-\s]/.test(str)) {
      str = str.split(/[-\s]/);
      temp = str.reduce((acc, v) => acc + obj[v], 0) || 0;
    } else temp = obj[str] || 0;
    //console.log(temp, str);
    return temp;
  };
  string = string.split(" ");

  let ans = 0;
  string.forEach((v, i, arr) => {
    if (v == "hundred" && arr[i + 1] == "thousand") {
      ans = digit(arr[i - 1]) * 100000;
      //   console.log(ans);
    } else if (v == "hundred" && arr[i + 1] !== "thousand") {
      ans = ans + digit(arr[i - 1]) * 100 || ans * 100;
      // ans *= 100;
    } else if (v == "thousand") {
      let d = digit(arr[i - 1]);
      ans += d;
      //  console.log(ans, " ans");
      ans =
        ans > 9
          ? ans > 99
            ? Number(ans.toString().padEnd(6, "0"))
            : Number(ans.toString().padEnd(5, "0"))
          : Number(ans.toString().padEnd(4, "0"));
    } else if (v == "million") {
      let d = digit(arr[i - 1]);
      ans += d;
      //  console.log(ans, " ans");
      ans =
        ans > 9
          ? ans > 99
            ? Number(ans.toString().padEnd(9, "0"))
            : Number(ans.toString().padEnd(8, "0"))
          : Number(ans.toString().padEnd(7, "0"));
    } else if (i === string.length - 1) {
      ans += digit(arr[i]);
    }
  });
  return ans;
}

console.log(
  parseInt("three hundred and fifty-one thousand five hundred and eighty-four")
);
