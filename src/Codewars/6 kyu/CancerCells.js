function cutCancerCells(body) {
  // Cut them!
  return body.replace(/c|[a-z]?C[a-z]?/g, "");
}

console.log(cutCancerCells("acb"));
// QL
