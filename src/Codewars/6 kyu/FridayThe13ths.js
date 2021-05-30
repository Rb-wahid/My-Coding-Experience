function fridayTheThirteenths(start, end) {
  if (!end) end = start;
    let date = new Date(start,1, 14);
    console.log(new Date(1999,7,14));
  let ans = [];
  for (let i = start; start <= end;) {
    for (let j = 0; j < 12; j++) {
      date.setMonth(j);
      console.log(date, date.getDay());
      if (date.getDay() === 6) {
        ans.push(
          `${date.getMonth() + 1}/${date.getDate() - 1}/${date.getFullYear()}`
        );
       
      }
    }
      start++;
    date.setFullYear(start);
  }
  return ans.join` `;
}

console.log(fridayTheThirteenths(1990 ,1998));
