function solution(str) {
    if ((str.length & 1) === 1)
        str += "_";
    let arr = [];

    for (let i = 0; i < str.length; i += 2) {
        arr.push(str.substring(i, i + 2))
    }
    return arr;
}

console.log(solution("abcde"));