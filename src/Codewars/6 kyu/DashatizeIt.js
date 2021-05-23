function dashatize(num) {
  //get 'em
  num = num.toString().replace("-", "");
  let ans = [];
  let flag = false;
  ans.push(+num[0] & 1 ? num[0] + "-" : num[0]);
  for (let i = 1; i < num.length - 1; i++) {
    if (+num[i] & 1) {
      ans.push(`-${num[i]}`);
      flag = true;
    } else {
      ans.push(flag ? "-" + num[i] : num[i]);
      flag = false;
    }
  }
  let len = num.length - 1;
  ans.push(+num[len] & 1 ? "-" + num[len] : num[len]);
  return ans.join``;
}

console.log(dashatize(6815));
