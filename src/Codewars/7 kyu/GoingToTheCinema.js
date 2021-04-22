function movie(card, ticket, perc) {
  // your code
  let costA = 0;
  let costB = card;
  let i = 0;
  while (Math.ceil(costB) >= costA) {
    costA += ticket;
    costB += ticket * Math.pow(perc, ++i);
  }
  return i;
}

console.log(movie(500, 15, 0.9));
