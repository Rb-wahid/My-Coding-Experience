function comp(array1, array2) {
  //your code here
  if (Array.isArray(array1) && Array.isArray(array2)) {
    const sort = (arr) => arr.sort((a, b) => a - b);
    array1 = sort(array1);
    array2 = sort(array2);

    return array1.every((el, i) => el * el == array2[i]);
  }
  return false;
}
