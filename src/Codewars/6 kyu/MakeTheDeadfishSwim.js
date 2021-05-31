// Return the output array, and ignore all non-op characters
function parse(data) {
    let i = 0;
    let ans = [];
    for (const el of data) {
        if (el === 'i')
            i++;
        else if (el === 's')
            i = i * i;
        else if (el === 'd')
            i--;
        else if (el === 'o')
            ans.push(i);
    }
    return ans;
}

console.log(parse("iiisdoso"));