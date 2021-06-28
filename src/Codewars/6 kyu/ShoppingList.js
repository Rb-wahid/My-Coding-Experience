var groceries = {
  "Orange Juice": {
    price: 1.5,
    discount: 10,
    bogof: false,
  },

  Chocolate: {
    price: 2,
    discount: 0,
    bogof: true,
  },

  // more items...
};

function shoppingListCost(arr) {
  //your code here

  let total = 0;
  for (const item in groceries) {
    arr.forEach((el) => {
      let qn = el[1];
      let price = 0;
      if (el[0] === item) {
        if (groceries[item].bogof) {
          qn = Math.round(qn / 2);
        }
        price = qn * groceries[item].price;
        total += price - (price * groceries[item].discount) / 100;
      }
    });
  }
  return +total.toFixed(2);
}

console.log(
  shoppingListCost([
    ["Orange Juice", 2],
    ["Chocolate", 4],
    ["Pears", 8],
  ])
);
