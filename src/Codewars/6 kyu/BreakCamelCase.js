// complete the function
function solution(string) {
    let ans = "";
    for (const el of string) {
        if (/[A-Z]/.test(el)) {
            ans += " " + el;
        } else {
            ans += el;
        }
    }

    return ans;
}

console.log(solution("camelCasingTest"));