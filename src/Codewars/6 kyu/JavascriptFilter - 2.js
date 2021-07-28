function roomMates(rooms, floor) {
  let roomStart = (floor - 1) * 6;
  let roomEnd = floor * 6;
  let roomMate = rooms.slice(roomStart, roomEnd);
  return roomMate.filter((mate) => mate != "");
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
