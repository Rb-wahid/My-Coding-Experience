function ranking(people) {
  let p = people;
  return p
    .sort((a, b) =>
      a.points === b.points ? a.name.localeCompare(b.name) : b.points - a.points
    )
    .map((v) => {
      v.position = p.findIndex((vv) => vv.points === v.points) + 1;
      return v;
    });
}

let people = [
  { name: "Vdmyg", points: 150 },
  { name: "Fdygzwbigi", points: 80 },
  { name: "Oimzs", points: 70 },
  { name: "Fjbkay", points: 40 },
  { name: "Wjrnh", points: 30 },
  { name: "Wdcinscfyu", points: 70 },
  { name: "Clbbkdqllh", points: 110 },
  { name: "Dmoqq", points: 20 },
];
console.log(ranking(people));
