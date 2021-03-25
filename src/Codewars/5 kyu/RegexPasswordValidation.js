function validate(password) {
  return (
    /[a-zA-Z\d]{6,}$/.test(password) &&
    /[a-z]+/.test(password) &&
    /[A-Z]+/.test(password) &&
    /\d+/.test(password)
  );
}
let password = "3aaaAe2";
console.log(validate(password));
