function reverse(arr) {
  //code me
  let len = arr.length - 1;
  for (let i = 0; i < arr.length / 2; i++) {
    temp = arr[i];
    arr[i] = arr[len];
    arr[len] = temp;
    len--;
  }
}
