function sharedBits(a, b) {
  //   Your code here

  return (a & b).toString(2).replace(/0/g, "").length > 1;
}

console.log(sharedBits(33070, 4848));
