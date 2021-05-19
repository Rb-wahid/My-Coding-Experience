function decode(string) {
  //your code here
  let ans = "";
  string = string.split``;

  for (const ch of string) {
    if (ch === "1" || ch === "9") ans += ch === "1" ? "9" : "1";
    else if (ch === "2" || ch === "8") ans += ch === "2" ? "8" : "2";
    else if (ch === "3" || ch === "7") ans += ch === "3" ? "7" : "3";
    else if (ch === "4" || ch === "6") ans += ch === "4" ? "6" : "4";
    else if (ch === "5" || ch === "0") ans += ch === "5" ? "0" : "5";
  }
  return ans;
}
