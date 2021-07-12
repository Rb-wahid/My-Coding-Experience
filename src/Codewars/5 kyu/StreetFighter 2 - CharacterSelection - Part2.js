function superStreetFighterSelection(fighters, position, moves) {
  let res = [];
  let [i, j] = [...position];
  let temp = 0;
  let row = fighters.length - 1;
  let coulmn = fighters[i].length - 1;
  const checkForLeft = (i, j) => {
    while (fighters[i][j] == "") {
      if (j - 1 >= 0) {
        j -= 1;
      } else {
        j = coulmn;
      }
    }
    return [i, j];
  };
    
      const checkForRight= (i, j) => {
       
           while (fighters[i][j] == "") {
             if (j + 1 <= coulmn) {
               j += 1;
             } else {
               j = 0;
             }
           }
          
        return [i, j];
      };

  let move = {
    up: () => {
      temp = i;
      if (i - 1 >= 0) {
        temp -= 1;
      } else {
        temp = row;
      }
      if (fighters[temp][j] == "") {
        res.push(fighters[i][j]);
      } else {
        i = temp;
        res.push(fighters[i][j]);
      }
    },
    down: () => {
      temp = i;
      if (i + 1 <= row) {
        temp += 1;
      } else {
        temp = 0;
      }
      if (fighters[temp][j] == "") {
        res.push(fighters[i][j]);
      } else {
        i = temp;
        res.push(fighters[i][j]);
      }
    },
    right: () => {
      temp = j;
      if (j + 1 <= coulmn) {
        temp += 1;
      } else {
        temp = 0;
      }
        
           [i, j] = [...checkForRight(i, temp)];
           res.push(fighters[i][j]);
    //   if (fighters[i][temp] == "") {
    //     if (temp + 1 <= coulmn) {
    //       temp += 1;
    //     } else {
    //       temp = 0;
    //     }
    //     res.push(fighters[i][temp]);
    //   } else {
    //     j = temp;
    //     res.push(fighters[i][j]);
    //   }
    },
    left: () => {
      temp = j;
      if (j - 1 >= 0) {
        temp -= 1;
      } else {
        temp = coulmn;
      }
      [i, j] = [...checkForLeft(i, temp)];
      res.push(fighters[i][j]);
      //   if (fighters[i][temp] == "") {
      //     if (temp - 1 >= 0) {
      //       temp -= 1;
      //     } else {
      //       temp = coulmn;
      //     }
      //     res.push(fighters[i][temp]);
      //   } else {
      //     j = temp;
      //     res.push(fighters[i][j]);
      //   }
    },
  };
  moves.forEach((posi) => move[posi]());
  return res;
}

fighters = [
  ["", "Ryu", "E.Honda", "Blanka", "Guile", ""],
  ["Balrog", "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat"],
  ["Vega", "T.Hawk", "Fei Long", "Deejay", "Cammy", "M.Bison"],
];

moves = ["left", "left", "left", "left", "left", "left", "left", "left"];
position = [0, 2];
//  solution = [
//    "Ryu",
//    "Guile",
//    "Blanka",
//    "E.Honda",
//    "Ryu",
//    "Guile",
//    "Blanka",
//    "E.Honda",
//  ];

console.log(superStreetFighterSelection(fighters, position, moves));
