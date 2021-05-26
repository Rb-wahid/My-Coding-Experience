function starSign(date) {
  let m = date.getMonth();
  let d = date.getDate();

  switch (m) {
    case 0:
      return d < 21 ? "Capricorn" : "Aquarius";
    case 1:
      return d < 20 ? "Aquarius" : "Pisces";
    case 2:
      return d < 21 ? "Pisces" : "Aries";
    case 3:
      return d < 21 ? "Aries" : "Taurus";
    case 4:
      return d < 22 ? "Taurus" : "Gemini";
    case 5:
      return d < 22 ? "Gemini" : "Cancer";
    case 6:
      return d < 23 ? "Cancer" : "Leo";
    case 7:
      return d < 24 ? "Leo" : "Virgo";
    case 8:
      return d < 24 ? "Virgo" : "Libra";
    case 9:
      return d < 24 ? "Libra" : "Scorpio";
    case 10:
      return d < 23 ? "Scorpio" : "Sagittarius";
    case 11:
      return d < 22 ? "Sagittarius" : "Capricorn";
  }
}
