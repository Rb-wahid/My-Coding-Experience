function balance(book) {
  // your code
  // Please use .toFixed(2) to format numbers
  let regex = /[^\w+\\.+]/gi;

  let arr = book.split("\n");
  let items = arr.length - 1;
  let ans = "Original_Balance: ";
  let mainBalance = arr[0];
  let balance = mainBalance;
  let price;
  let string;
  let s;
  let itemPrice;
  ans += `${balance}\r`;

  for (let i = 1; i < arr.length; i++) {
    s = arr[i].split(" ");
    for (let j = 0; j < 3; j++) {
      price = s[2].replace(regex, "").trim();
      price = Number(price).toFixed(2);
      string = s[j].replace(regex, "").trim();
      // itemPrice = string.replace("(\d+\.?\d*)", "");
      if (j === 2) {
        ans += `${price} `;
      } else {
        ans += `${string} `;
      }

      // console.log(ans);
    }

    balance = (balance - price).toFixed(2);
    ans += `Balance ${balance}\r`;
  }
  let totalExpense = (mainBalance - balance).toFixed(2);
  ans += `Total expense  ${totalExpense}
Average expense  ${(totalExpense / items).toFixed(2)}`;

  return ans;
}

let book = `1233.00
125 Hardware;! 24.8?;
123 Flowers 93.5
127 Meat 120.90
120 Picture 34.00
124 Gasoline 11.00
123 Photos;! 71.4?;
122 Picture 93.5
132 Tyres;! 19.00,?;
129 Stamps 13.6
129 Fruits{} 17.6
129 Market;! 128.00?;
121 Gasoline;! 13.6?;`;

console.log(balance(book));
