//00:41:43
function solution(data) {
  let [n, skill] = data.trim().split('\n');
  let cnt = 0;
  const skillNum = ['1', '2', '3', '4', '5', '6', '7', '8', '9'];
  let skillLR = 0;
  let skillSK = 0;
  let isOk = true;

  for (let i = 0; isOk && i < n; i++) {
    switch (skill[i]) {
      case 'L':
        skillLR++;
        break;
      case 'S':
        skillSK++;
        break;
      case 'R':
        if (skillLR == 0) isOk = false;
        else {
          cnt++;
          skillLR--;
        }
        break;
      case 'K':
        if (skillSK == 0) isOk = false;
        else {
          cnt++;
          skillSK--;
        }
        break;
      default:
        cnt++;
    }
  }
  return cnt;
}

const case1 = `5
S12K2`;
const case2 = `4
1LKR`;
const case3 = `4
SSKK`;

console.log(solution(case1));
console.log(solution(case2));
console.log(solution(case3));
