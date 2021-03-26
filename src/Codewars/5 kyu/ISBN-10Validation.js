function validISBN10(isbn) {
  // TODO: return true if (and only if) isbn is a valid 10-digit ISBN.
   
    let arr = isbn.split("");
     if (arr.length !== 10 ) {
       return false;
     }
    if (arr[9] === "X") {
        arr[9] = "10";
    }

    let sum = 0;

    for (const i in arr) {
        sum += parseInt(arr[i]) * (parseInt(i)+1);
    }

    return sum % 11 === 0;
}

let isbn = "048665088X";

console.log(validISBN10(isbn));