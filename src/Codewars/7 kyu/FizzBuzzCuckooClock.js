function fizzBuzzCuckooClock(time) {
    const [h, m] = time.split`:`;

    return m == 0
      ? "Cuckoo ".repeat(h % 12 || 12).trim()
      : m == 30
      ? "Cuckoo"
      : !(m % 15)
      ? "Fizz Buzz"
      : !(m % 3)
      ? "Fizz"
      : !(m % 5)
      ? "Buzz"
      : "tick";
}

console.log(fizzBuzzCuckooClock("00:00"));
