function fizzBuzzCuckooClock(time) {
  // your code here
  const [h, m] = time.split`:`;

  if (!m % 3 && !m % 5) {
    return m == "00"
      ? "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
      : m == "30"
      ? "Cuckoo"
      : "Fizz Buzz";
  } else if (!m % 3) return "Fizz";
  else if (!m % 5) return "Buzz";
  else return "tick";
}

console.log(fizzBuzzCuckooClock("13:34"));
