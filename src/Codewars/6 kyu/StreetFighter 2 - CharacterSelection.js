function streetFighterSelection(fighters, position, moves) {
  let res = [];
  let [i, j] = [...position];

  let row = fighters.length - 1;
  let coulmn = fighters[i].length - 1;

  let move = {
    up: () => {
      if (i - 1 >= 0) {
        i -= 1;
      }
      res.push(fighters[i][j]);
    },
    down: () => {
      if (i + 1 <= row) {
        i += 1;
      }

      res.push(fighters[i][j]);
    },
    right: () => {
      if (j + 1 <= coulmn) {
        j += 1;
      } else {
        j = 0;
      }

      res.push(fighters[i][j]);
    },
    left: () => {
      if (j - 1 >= 0) {
        j -= 1;
      } else {
        j = coulmn;
      }

      res.push(fighters[i][j]);
    },
  };
  moves.forEach((posi) => move[posi]());
  return res;
}

console.log(
  streetFighterSelection(
    [
      ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
      ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"],
    ],
    [0, 0],
    ["up", "left", "right", "left", "left"]
  )
);
