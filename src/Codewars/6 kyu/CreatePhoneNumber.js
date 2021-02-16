function createPhoneNumber(n) {
  let format = "(xxx) xxx-xxxx";

  for (let i = 0; i < n.length; i++) {
    format = format.replace("x", n[i]);
  }

  console.log(format);
}


//link -> https://www.codewars.com/kata/reviews/525f50e3b73515a6db000b86/groups/539ceeedb9de00c4da000a4e