var Sudoku = function (board) {
  //   Private methods
  // -------------------------

  //   Public methods
  // -------------------------
  return {
    isValid: function () {
      //TODO
      console.log(board, " board");
      let numStr = "";
      let len = board.length;
      while (len > 0) {
        numStr += len;
        len--;
      }
      console.log(new RegExp(numStr, "g"), " len");
      const isEveryRowValid = (arr) => arr.every((el) => isValidDigit(el));
      const isValidDigit = (el) =>
        new RegExp(numStr, "g").test(el.sort().reverse().join``);
      const isValid3x3 = (k, m, arr) => {
        let temp = [];
        let limit = board.length % 3 == 0 ? 3 : board.length;
        for (let i = 0 + k; i < limit + k; i++) {
          for (let j = 0 + m; j < limit + m; j++) {
            console.log(i, j, arr[i][j]);
            if (arr[i][j]) {
              temp.push(arr[i][j]);
            } else return false;
          }
          temp.push(" ");
        }
        // console.log(isValidDigit(temp), temp);
        //  console.log("after 3x3\n");

        return isValidDigit(temp);
      };

      let result = [];
      if (board.length % 3 == 0) {
        for (let i = 0; i < board.length - 1; i += 3) {
          for (let j = 0; j < board.length - 1; j += 3) {
            result.push(isValid3x3(i, j, board));
          }
        }
        console.log(isEveryRowValid(board), " everywor");
        // console.log(result.every((el) => el === true), ' every')
        // console.log(result.every((el) => el === true) && isEveryRowValid(board),"  ans")
        return result.every((el) => el === true) && isEveryRowValid(board);
      } else {
        return isEveryRowValid(board);
      }
    },
  };
};
