function lifePathNumber(dateOfBirth) {
    dateOfBirth = dateOfBirth.split("-")
  // Your solution...
    const divDigit = num => {
        let result = sum(num);
        while (result.toString().length !== 1)
            result = sum(result);
        
        return result;
    }
    const sum = num => num.toString().split``.reduce((a, b) => +a + +b);
    let lifenum = dateOfBirth.map(el => divDigit(el)).reduce((a,b) => a+b);
  return divDigit(lifenum);
}

console.log(lifePathNumber("1879-03-14"));