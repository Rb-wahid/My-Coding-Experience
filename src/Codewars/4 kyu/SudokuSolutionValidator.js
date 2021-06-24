function validSolution(board) {
  //TODO
  const isEveryRowValid = (arr) => arr.every((el) => isValidDigit(el));
  const isValidDigit = (el) => /123456789/g.test(el.sort().join``);
  const isValid3x3 = (k, m, arr) => {
    let temp = [];
    for (let i = 0 + k; i < 3 + k; i++) {
      for (let j = 0 + m; j < 3 + m; j++) {
        temp.push(arr[i][j]);
      }
    }
    return isValidDigit(temp);
  };

  let result = [];
  for (let index = 0; index < 9; index += 3) {
    result.push(isValid3x3(index, index, board));
  }
  return result.every((el) => el === true) && isEveryRowValid(board);
}
