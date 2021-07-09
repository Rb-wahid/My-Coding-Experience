function parseKidList(csv) {
  const formate = (digit) => (digit < 10 ? "0" + digit : digit);
  const formateDate = (date) => {
    date = date.split("/");
    return `${formate(date[0])}/${formate(date[1])}/${date[2]}`;
  };
  let split = csv.split`\n`;
  let filter = split
    .map((per) => per.split(","))
    .map((p) => {
      let person = `${p[0].toUpperCase()} (${p[2].toUpperCase()}) ${formateDate(
        p[1]
      )}`;
      return person;
    });

  return filter; // return whatever you want
}

function sortByNames(kids) {
  return kids.sort(); // return sorted list of well-formatted kids
}

let KIDS = parseKidList("Jawed,9/4/2012,m\nAnna,16/6/2013,f\nZina,2/12/2011,f");

console.log(sortByNames(KIDS));
//["ANNA (F) 16/06/2013","JAWED (M) 09/04/2012","ZINA (F) 02/12/2011"]
