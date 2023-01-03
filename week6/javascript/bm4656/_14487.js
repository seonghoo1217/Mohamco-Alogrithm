//00:31:04
function solution(data) {
  let [n, arr] = data.toString().trim().split('\n');
  let answer = 0;
  arr = arr.split(' ').map(Number);

  const maxPoint = Math.max(...arr);

  answer = arr.reduce((sum, cur) => sum + cur) - maxPoint;
  return answer;
}

const case1 = `5
1 6 5 2 4`;
const case2 = `4
100 100 100 101`;

console.log(solution(case1));
console.log(solution(case2));
