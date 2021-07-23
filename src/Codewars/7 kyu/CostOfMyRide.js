function insurance(age, size, numofdays) {
  //code here
  if (numofdays < 0) return 0;
  age = age < 25 ? 10 : 0;
  size = size == "economy" ? 0 : size == "medium" ? 10 : 15;
  return (50 + age + size) * numofdays;
}
