const Calculator = function () {
  this.evaluate = (string) => {
    // do code here
      string = string.split(" ");
      let flag = true;
      while (flag) {
        for (let i = 1; i < string.length; i++) {
          if (string[i] === "*") {
            string[i - 1] = (
              parseInt(string[i - 1]) * parseInt(string[i + 1])
            ).toString();
            string[i] = null;
            string[i + 1] = null;
            string = string.filter((x) => x !== null);
            //  console.log(string[i - 1]);
            i++;
          }
        }

        for (let i = 1; i < string.length; i++) {
          if (string[i] === "/") {
            string[i - 1] = (
              parseInt(string[i - 1]) / parseInt(string[i + 1])
            ).toString();
            string[i] = null;
            string[i + 1] = null;
            string = string.filter((x) => x !== null);
            //  console.log(string[i - 1]);
            i++;
          }
        }

        for (let i = 1; i < string.length; i++) {
          if (string[i] === "+") {
            string[i - 1] = (
              parseInt(string[i - 1]) + parseInt(string[i + 1])
            ).toString();
            string[i] = null;
            string[i + 1] = null;
            string = string.filter((x) => x !== null);
            //  console.log(string[i - 1]);
            i++;
          }
        }

        for (let i = 1; i < string.length; i++) {
          if (string[i] === "-") {
            string[i - 1] = (
              parseInt(string[i - 1]) - parseInt(string[i + 1])
            ).toString();
            string[i] = null;
            string[i + 1] = null;
            string = string.filter((x) => x !== null);
            //  console.log(string[i - 1]);
            i++;
          }
        }
          if (string.length === 1) {
              flag = false;
              break;
          }
        
      }
      return string.join("");
  };
};


	var calculate = new Calculator(); 
console.log(  calculate.evaluate("10 * 5 / 2"));
console.log(calculate.evaluate("2"));