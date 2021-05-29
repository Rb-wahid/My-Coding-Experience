function countDays(d) {
  //have fun with coding! :)
  let today = new Date();
  d = new Date(d);

  if (d.toLocaleDateString() === today.toLocaleDateString())
    return "Today is the day!";
  else if (today > d) return "The day is in the past!";
  else {
    fDay = (d - today) / (1000 * 86400);
    return `${Math.round(fDay)} days`;
  }
}

console.log(countDays(new Date("March 7, 2029")));
