function initializeNames(name) {
  // Insert your brilliant code here
  let arr = name.trim().split(" ");
  if (arr.length < 3) return name;
  for (let i = 1; i < arr.length - 1; i++) {
    arr[i] = arr[i][0].toUpperCase() + ".";
  }
  return arr.join(" ");
}

console.log(initializeNames("Jack"));
