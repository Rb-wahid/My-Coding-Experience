// complete the function
function solution(string) {
    return string.replace(/([A-Z])/g, ' $1');
}

console.log(solution("camelCasingTest"));