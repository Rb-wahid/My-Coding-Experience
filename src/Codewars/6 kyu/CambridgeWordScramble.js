const _ = require("lodash");
function mixwords(str) {
  if (typeof str !== "string") return undefined;

  return str.replace(/\B[a-z]+\B/g, (s) =>
    s.length < 3 ? s : _.shuffle(s).join``
  );
}
console.log(mixwords("hey there, friends!"));
