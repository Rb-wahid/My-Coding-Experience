function checkCoupon(enteredCode, correctCode, currentDate, expirationDate) {
  return (
    Date.parse(currentDate) <= Date.parse(expirationDate) &&
    enteredCode === correctCode
  );
}

console.log(checkCoupon("123a", "123", "September 5, 2014", "October 1, 2014"));
