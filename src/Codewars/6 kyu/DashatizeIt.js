function dashatize(num) {
  //get 'em
  num = num.toString().replace("-", "");
  if (num.length < 2) return num;
  let ans = [];
  let flag = false;
  ans.push(+num[0] & 1 ? num[0] + "-" : num[0]);
  for (let i = 1; i < num.length - 1; i++) {
    if (+num[i] & 1) {
      ans.push(`-${num[i]}-`);
    } else {
      ans.push(num[i]);
    }
  }
  let len = num.length - 1;
  ans.push(+num[len] & 1 ? `-${num[len]}` : num[len]);
  ans = ans.join``.split``;
  for (let i = 1; i < ans.length; i++) {
    if (ans[i] === "-" && ans[i] === ans[i - 1]) ans[i] = "";
  }
  return ans.join``;
}

console.log(dashatize(2511));
