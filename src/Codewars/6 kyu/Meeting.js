function meeting(s) {
  return `(${s
    .toUpperCase()
    .split(";")
    .map((n) => n.split(":").reverse().join(", "))
    .sort()
    .join(")(")})`;
}
let s =
  "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

console.log(meeting(s));
