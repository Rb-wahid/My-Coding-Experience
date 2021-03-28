var uniqueInOrder = function (iterabl) {
  //your code here - remember iterable can be a string or an array
    iterable = iterabl.split("");
    for (let i = 0; i < iterable.length - 1; i++) {
            if (iterable[i] === iterable[i+1]) {
                iterable[i + 1] = null;
            }
        
    }
    return iterable.filter(el => el != null);
};
console.log(uniqueInOrder("ABBCcAADAD"));
