function chineseZodiac(year) {
  let A = [
    "Rat",
    "Ox",
    "Tiger",
    "Rabbit",
    "Dragon",
    "Snake",
    "Horse",
    "Goat",
    "Monkey",
    "Rooster",
    "Dog",
    "Pig",
  ];

  let E = ["Wood", "Fire", "Earth", "Metal", "Water"];
  let a = (year - 1924) % 12;
  let e = Math.floor((year - 1924) / 2) % 5;
  return E[e] + " " + A[a];
}
