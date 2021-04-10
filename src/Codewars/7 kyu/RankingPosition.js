function ranking(p) {
    let people = p;
  for (let i = 0; i < people.length - 1; i++) {
    if (people[i].points < people[i + 1].points) {
      temp = people[i];
      people[i] = people[i + 1];
      people[i + 1] = temp;
      i--;
    }
  }
  for (let i = 0; i < people.length - 1; i++) {
    if (
      people[i].points === people[i + 1].points &&
      people[i].name > people[i + 1].name
    ) {
      temp = people[i];
      people[i] = people[i + 1];
      people[i + 1] = temp;
      i--;
    }
  }
  let position = 1;
  let samePosition = 0;

  for (let i = 0; i < people.length - 1; i++) {
    if (people[i].points === people[i + 1].points) {
      people[i].position = position;
      people[i + 1].position = position;
      i++;
      samePosition += 2;
    } else {
      people[i].position = position + samePosition;
      position++;
      samePosition = 0;
    }
  }
  people[people.length - 1].position = position + samePosition;

  return people;
}

let people = [
  {
    name: "John",
    points: 100,
  },
  {
    name: "Bob",
    points: 130,
  },
  {
    name: "Mary",
    points: 120,
  },
  {
    name: "Kate",
    points: 120,
  },
];

console.log(ranking(people));
