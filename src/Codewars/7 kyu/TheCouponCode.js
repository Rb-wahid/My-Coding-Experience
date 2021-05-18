function checkCoupon(enteredCode, correctCode, currentDate, expirationDate) {
  let date = new Date(currentDate);
  let date2 = new Date(expirationDate);

  return date <= date2 && enteredCode === correctCode;
}

console.log(checkCoupon("123a", "123", "September 5, 2014", "October 1, 2014"));
