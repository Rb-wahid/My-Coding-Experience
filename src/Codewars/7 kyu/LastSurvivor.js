function lastSurvivor(letters, coords) {
  letters = letters.split``;
  for (let i = 0; i < coords.length; i++) {
    letters.splice(coords[i], 1);
  }

  return letters.join``;
}

console.log(lastSurvivor("zbk", [0, 1]));
