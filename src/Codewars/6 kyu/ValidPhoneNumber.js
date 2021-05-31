function validPhoneNumber(phoneNumber) {
  //TODO: Return whether phoneNumber is in the proper form
    let reg = /^\((\d){3}\)\s(\d){3}-(\d){4}$/;

    return reg.test(phoneNumber);
}

console.log(validPhoneNumber("(123) 456-7890"));