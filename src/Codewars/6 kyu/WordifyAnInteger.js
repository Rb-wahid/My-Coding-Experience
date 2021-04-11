function wordify(n) {
  //your code here
    let oneToNine = {
        1: 'one',
        2: 'two',
        3: 'three',
        4: 'four',
        5: 'five',
        6: 'six',
        7: 'seven',
        8: 'eight',
        9: 'nine',
    }

    let afterTenToNineteen = {
        10: 'ten',
        11: 'eleven',
        12: 'twelve',
        13: 'thirteen',
        14: 'fourteen',
        15: 'fifteen',
        16: 'sixteen',
        17: 'seventeen',
        18: 'eighteen',
        19: 'nineteen',
    }

    let others = {
        20: 'twenty',
        30: 'thirty',
        40: 'forty',
        50: 'fifty',
        60: 'sixty',
        70: 'seventy',
        80: 'eighty',
        90: 'ninety',
    }
            let ans = "";
    while (n !== 0) {
        if (n < 10) {
            for (const key in oneToNine) {
                if (Number(key) === n) {
                    ans += oneToNine[key];
                    n = 0;
                    break;
                }
            }
        } else if (n >= 10 && n < 20) {
            for (const key in afterTenToNineteen) {
                if (Number(key) === n) {
                    ans += afterTenToNineteen[key];
                    n = 0;
                    break;
                }
            }
        } else if (n >= 20 && n < 100) {
            let a = n % 10;
            let b = n - a;
            for (const key in others) {
                if (Number(key) === b) {
                    ans += others[key] + " ";
                    n = a;
                    break;
                }
            }
        } else if (n >= 100) {
            let first = n;

            while (first >= 10) {
                first /= 10;
            }
            first = parseInt(first);
            console.log("first ", first, );
            for (const key in oneToNine) {
              if (Number(key) === first) {
                  ans += oneToNine[key] + " hundred ";
                  n %= 100;
                  break;
              }
            }
        }
    }
    return ans.trim();
}

console.log(wordify(326));