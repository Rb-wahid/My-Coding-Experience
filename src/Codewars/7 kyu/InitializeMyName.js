function initializeNames(name) {
  // Insert your brilliant code here
  let arr = [];
  let nameArr = name.trim().split(" ");
  if (nameArr.length < 3) return name;
  let firstWord;
  for (let i = 1; i < nameArr.length - 1; i++) {
    firstWord = nameArr[i].charAt(0).toUpperCase() + ".";
    arr.push(firstWord);
  }
  console.log(nameArr);
  arr.push(nameArr[nameArr.length - 1]);
  arr.unshift(nameArr[0]);
  return arr.join(" ");
}

console.log(initializeNames("Jack gfdgf gg "));
