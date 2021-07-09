function parseKidList(csv) {
  const formate = (date) =>
    date
      .split("/")
      .map((d) => d.padStart(2, "0"))
      .join("/");

  return csv.split`\n`.map((per) => {
    let p = per.split(",");
    let person = `${p[0].toUpperCase()} (${p[2].toUpperCase()}) ${formate(
      p[1]
    )}`;
    return person;
  });
}

function sortByNames(kids) {
  return kids.sort(); // return sorted list of well-formatted kids
}

let KIDS = parseKidList("Jawed,9/4/2012,m\nAnna,16/6/2013,f\nZina,2/12/2011,f");

console.log(sortByNames(KIDS));
//["ANNA (F) 16/06/2013","JAWED (M) 09/04/2012","ZINA (F) 02/12/2011"]
