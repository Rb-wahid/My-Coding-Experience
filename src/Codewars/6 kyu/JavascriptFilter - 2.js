function roomMates(rooms, floor) {
  return rooms.filter((mate, idx) => {
    if (mate != "" && Math.floor(idx / 6) == floor - 1) {
      return true;
    }
  });
}

rooms = [
  "Jill",
  "Jackson",
  "Jan",
  "Eve",
  "",
  "John",
  "Jimmy",
  "Tom",
  "",
  "Duke",
];

console.log(roomMates(rooms, 2));
