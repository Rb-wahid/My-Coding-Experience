function bangBang(history) {
  let sp = history.split("\n");
    sp = sp.map((el) => el.replace(/(\d+)\s?\W/, ""));

  return sp[sp.length - 1].trim();
}

console.log(
  bangBang(`1 more beer
   2 less me
   3 cd ..
   4 touch me
   5 cd /pub
   6 less me
   7 lost
   8 cd /pub
   9 lost
   10 touch me
   11 more beer
   12 cd ..
   13 lost
   14 less me
   15 more me
   16 touch me
   17 chmod 000 me
   18 less me
   19 cd ..
   20 lost
   21 more beer
   22 more beer
   23 cd ..
   24 less me
   25 more beer
   26 touch me
   27 touch me
   28 cd /pub`)
);
