function mixwords(str) {
  // your code here!
  if (typeof str !== "string") return undefined;
  str = str.split` `;
  let result = [];
  let alpbt, rep;
  for (const el of str) {
    alpbt = el.match(/\w+/)[0];
    rep = el.replace(/\w+/, "@");
    rep = rep.split``;
    for (let i = 0; i < rep.length; i++) {
      if (rep[i] === "@") {
        rep[i] = ans(alpbt);
        console.log("true");
      }
    }
    result.push(rep.join``);
  }

  return result.join` `;
}
const ans = (str) => {
  let len = str.length;
  if (len <= 3) return str;
  let temp = str.split``;
  let rndm;
  for (let i = 1; i < len - 1; i++) {
    rndm = random(i, len - 1);
    temp[i] = str[rndm];
    temp[rndm] = temp[i];
  }
  return temp.join``;
};
const random = (low, high) => Math.floor(Math.random() * (high - low)) + low;

console.log(mixwords("hey there, friends!"));
