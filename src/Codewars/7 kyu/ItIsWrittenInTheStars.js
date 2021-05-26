function starSign(date) {
  let m = date.getMonth() + 1;
  let d = date.getDate();
  console.log(m, d);
  if ((m === 1 && d >= 21) || (m === 2 && d <= 19)) return "Aquarius";
  else if ((m === 2 && d >= 20) || (m === 3 && d <= 20)) return "Pisces";
  else if ((m === 3 && d >= 21) || (m === 4 && d <= 20)) return "Aries";
  else if ((m === 4 && d >= 21) || (m === 5 && d <= 21)) return "Taurus";
  else if ((m === 5 && d >= 22) || (m === 6 && d <= 21)) return "Gemini";
  else if ((m === 6 && d >= 22) || (m === 7 && d <= 22)) return "Cancer";
  else if ((m === 7 && d >= 23) || (m === 8 && d <= 23)) return "Leo";
  else if ((m === 8 && d >= 24) || (m === 9 && d <= 23)) return "Virgo";
  else if ((m === 9 && d >= 24) || (m === 10 && d <= 23)) return "Libra";
  else if ((m === 10 && d >= 24) || (m === 11 && d <= 22)) return "Scorpio";
  else if ((m === 11 && d >= 23) || (m === 12 && d <= 21)) return "Sagittarius";
  else return "Capricorn";

  return;
}
