function expandedForm(num) {
  // Your code here
  let ans = [];
  let n;
  while (num !== 0) {
    n = num % div(num);
    ans.push(num - n);
    num = n;
  }
  return ans.join(" + ");
}

function div(str) {
  let len = str.toString().length - 1;
  let s = "1";
  while (len !== 0) {
    s += "0";
    len--;
  }

  return Number(s);
}

console.log(expandedForm(70));
