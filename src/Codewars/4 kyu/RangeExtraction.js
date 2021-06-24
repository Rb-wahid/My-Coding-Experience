function solution(list) {
  // TODO: complete solution
  let result = [];
  let temp = [];
  for (let i = 0; i < list.length; i++) {
    if (list[i] + 1 === list[i + 1]) {
      temp.push(list[i]);
      temp.push(list[i + 1]);
    } else {
      if (temp.length > 2) {
        result.push(`${temp[0]}-${temp[temp.length - 1]}`);
        temp = [];
      } else {
        if (temp.length > 0) {
          result.push(...temp);
          temp = [];
        } else result.push(list[i]);
      }
    }
  }
  return result.join`,`;
}

console.log(
  solution([
    -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20,
  ])
);
