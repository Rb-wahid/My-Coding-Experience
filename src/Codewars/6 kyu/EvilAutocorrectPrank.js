function autocorrect(input) {
  let regex = /^u$|^yo[u]+$/;
  return input.split` `.map((a) => a.replace(regex, "your sister")).join` `;
}

console.log(autocorrect("you are so Beautiful!"));
