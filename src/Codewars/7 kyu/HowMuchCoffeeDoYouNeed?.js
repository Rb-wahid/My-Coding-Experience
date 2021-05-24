function howMuchCoffee(events) {
  // Code go here
  let regxLw = /(^[a-z]+)$/;
  let regxHg = /(^[A-Z]+)$/;
  let valid = /(cat)(dog)/gi;

  let count = 0;

  for (const el of events) {
    if (regxLw.test(el)) {
      count++;
      console.log(count, el);
    }
    if (regxHg.test(el)) {
      console.log(count, el);
      count += 2;
    }
  }

  str = events.join``;
  return valid.test(str) ? "You need extra sleep" : count;
}

console.log(howMuchCoffee(["OTHER", "cw", "dog"]));
