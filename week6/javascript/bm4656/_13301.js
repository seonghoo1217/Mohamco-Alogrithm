//00:31:04
function solution(data) {
  const n = data.toString().trim().split('\n').map(Number);
  const range = (start, end) => {
    let arr = [];
    for (let i = start; i < end; ++i) {
      arr.push(i);
    }
    return arr;
  };

  let answer = [0, 4, 6];
  const result = input => {
    if (input === 1) return 4;
    if (input === 2) return 6;
    else {
      for (let i of range(3, 81)) {
        answer.push(answer[i - 1] + answer[i - 2]);
      }
      return answer[input];
    }
  };
  return result(n);
}

const case1 = `5`;
const case2 = `6`;

console.log(solution(case1));
console.log(solution(case2));
