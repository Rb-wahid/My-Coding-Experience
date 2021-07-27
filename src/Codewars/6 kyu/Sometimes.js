function sometimes(fn) {
  // your code goes here
  let i = 0;
  return (a, b) => {
    i += 1;
    if (i <= 3 || (i & 1) == 1) {
      return fn(a, b);
    } else {
      return `hmm, I don't know!`;
    }
  };
}
