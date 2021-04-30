function meeting(s) {
  return s
      .toUpperCase()
      .split(';')
      .map(n => n.split(':').reverse())
      .sort()
    .reduce((a, c) => a += `(${c[0]}, ${c[1]})`, "")
}
let s =
  "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

console.log(meeting(s));
