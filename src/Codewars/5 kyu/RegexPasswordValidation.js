function validate(password) {
    let regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[\w]{6,}$/gm;
  return regex.test(password);
}
let password = "1aAaswf"
console.log(validate(password));