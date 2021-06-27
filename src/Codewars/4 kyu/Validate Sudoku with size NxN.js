var Sudoku = function (board) {
  //   Private methods
  // -------------------------

  //   Public methods
  // -------------------------
  return {
    isValid: function () {
      //TODO

      const isEveryRowValid = (arr) => arr.every((el) => isValidDigit(el));
      const isValidDigit = (el) => {
        let len = board.length;
        while (len > 0) {
          if (!el.includes(len)) return false;
          len--;
        }
        return true;
      };
      const isValid3x3 = (k, m, arr) => {
        let temp = [];
        let limit = board.length % 3 == 0 ? 3 : board.length;
        for (let i = 0 + k; i < limit + k; i++) {
          for (let j = 0 + m; j < limit + m; j++) {
            if (arr[i][j]) {
              temp.push(arr[i][j]);
            } else return false;
          }
        }
        return isValidDigit(temp);
      };

      let result = [];
      if (board.length % 3 == 0) {
        for (let i = 0; i < board.length - 1; i += 3) {
          for (let j = 0; j < board.length - 1; j += 3) {
            result.push(isValid3x3(i, j, board));
          }
        }
        return result.every((el) => el === true) && isEveryRowValid(board);
      } else {
        return isEveryRowValid(board);
      }
    },
  };
};
