function fizzBuzzCuckooClock(time) {
  console.log(time);
  // your code here
  const cuckoo = (h) => {
    let ans = "";
    h = h % 12;
    if (h == 0) h = 12;
    while (h-- > 0) ans += "Cuckoo ";

    return ans.trim();
  };
  let [h, m] = time.split`:`;
  m = +m;
  h = +h;
  if (!(m % 3) && !(m % 5)) {
    return m == 0 ? cuckoo(h) : m == 30 ? "Cuckoo" : "Fizz Buzz";
  } else if (!(m % 3)) return "Fizz";
  else if (!(m % 5)) return "Buzz";
  else return "tick";
}

console.log(fizzBuzzCuckooClock("00:00"));
