function pizzaRewards(customers, minOrders, minPrice) {
  let count = 0;
  let ans = [];
  for (const key in customers) {
    for (const p of customers[key]) {
      if (p > minPrice) {
        count++;
      }
    }
    if (count >= minOrders) ans.push(key);
    count = 0;
  }
  return ans;
}

var minOrders = 5;
var minPrice = 20;
var customers = {
  "John Doe": [22, 30, 11, 17, 15, 52, 27, 12], // Only has three orders above 20$, so no pizza
  "Jane Doe": [5, 17, 30, 33, 40, 22, 26, 10, 11, 45], // Has six orders above 20$, which means FREE PIZZA!
};

console.log(pizzaRewards(customers, minOrders, minPrice));
