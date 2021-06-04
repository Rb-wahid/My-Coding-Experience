const decrypt = (str) => {
  if (!str) return str;
  let revrs = str.match(/\'\d+\'/g);
  let rep = str.replace(/\'\d+\'/g, "@");
  let ans = [];
  for (let i = 0, j = 0; i < rep.length; i++) {
    if (rep[i] === "@") {
      digit = +revrs[j].replace(/\'/g, "");
      ans.push(String.fromCharCode(digit));
      j++;
    } else ans.push(rep[i]);
  }

  return ans.reverse().join``;
};

console.log(decrypt("'101''99''105''108''65'4"));
