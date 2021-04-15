function proofread(s) {
  //Insert code here.
  return s
    .replace(new RegExp("ie", "gi"), "ei")
    .split(".")
    .map((st) => {
      st = st.trim();
      return st.substring(0, 1).toUpperCase() + st.substring(1).toLowerCase();
    })
    .join(". ")
    .trim();
}

console.log(
  proofread("ThiEr DEcIEt wAs INconcIEVablE. sHe SIeZeD thE moMENT.")
);
