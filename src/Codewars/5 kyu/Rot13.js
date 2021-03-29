function rot13(message) {
  //your code here
  let ancii;
  let ans = "";
  for (const el of message) {
    ancii = el.charCodeAt(0);

    if (ancii >= 97 && ancii <= 122) {
      if (ancii + 13 > 122) ancii = ancii + 13 - 26;
      else {
        ancii += 13;
      }

      console.log(ancii, String.fromCharCode(ancii));
      ans += String.fromCharCode(ancii);
    } else if (ancii >= 65 && ancii <= 90) {
      if (ancii + 13 > 90) ancii = ancii + 13 - 26;
      else {
        ancii += 13;
      }

      console.log(ancii, String.fromCharCode(ancii));
      ans += String.fromCharCode(ancii);
    }
  }
  return ans;
}

console.log(rot13("Test"));
