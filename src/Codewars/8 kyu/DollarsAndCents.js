function formatMoney(amount) {
  // your formatting code here
    return `$${amount.toFixed(2)}`
}

console.log(formatMoney(3.9));