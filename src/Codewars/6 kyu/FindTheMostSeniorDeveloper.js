function findSenior(list) {
  // thank you for checking out the Coding Meetup kata :)
  let max = Math.max(...list.map((el) => el.age));
  let result = list.filter((dev) => dev.age >= max);

  return result;
}
