function cutCancerCells(body) {
  // Cut them!
  console.log(body);
  let norCell = /[a-z]/;
  body = body.split``;
  for (let i = 0; i < body.length; i++) {
    if (body[i] === "C") {
      body[i] = "#";
      if (norCell.test(body[i - 1])) body[i-1] = "#";
      if (norCell.test(body[i + 1])) body[i + 1] = "#";
    }
  }
  return body.filter((a) => a !== "#" && a !== "c").join``;
}

console.log(cutCancerCells("aCb"));
// QL
