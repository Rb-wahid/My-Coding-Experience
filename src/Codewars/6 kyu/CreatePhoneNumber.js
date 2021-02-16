function createPhoneNumber(n) {

    let ans = `(`;
    for (let i = 0; i < 3; i++) {
        ans += `${n[i]}`;
    }

    ans += `) `;

    for (let i = 3; i < 6; i++) {
      ans += `${n[i]}`;
    }

    ans += `-`;

    for (let i = 6; i < n.length; i++) {
      ans += `${n[i]}`;
    }

    return ans;
}
