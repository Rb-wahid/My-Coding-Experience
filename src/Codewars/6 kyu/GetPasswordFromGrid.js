function getPassword(grid, directions) {
  // your code here
  let findStart = (grid) => {
    for (let i = 0; i < grid.length; i++) {
      for (let j = 0; i < grid[0].length; j++) {
        if (grid[i][j] == "x") {
          return [i, j];
        }
      }
    }
    return [-1, -1];
  };
  let [i, j] = findStart(grid);
  let ans = [];
  for (const dir of directions) {
    if (dir == "rightT") {
      j++;
      ans.push(grid[i][j]);
    } else if (dir == "leftT") {
      j--;
      ans.push(grid[i][j]);
    } else if (dir == "right") {
      j++;
    } else if (dir == "left") {
      j--;
    } else if (dir == "upT") {
      i--;
      ans.push(grid[i][j]);
    } else if (dir == "downT") {
      i++;
      ans.push(grid[i][j]);
    } else if (dir == "up") {
      i--;
    } else if (dir == "down") {
      i++;
    }
  }

  return ans.join``;
}

let t1 = [
    ["x", "l", "m"],
    ["o", "f", "c"],
    ["k", "i", "t"],
  ],
  t1d = ["rightT", "down", "leftT", "right", "rightT", "down", "left", "leftT"];

console.log(getPassword(t1, t1d));
