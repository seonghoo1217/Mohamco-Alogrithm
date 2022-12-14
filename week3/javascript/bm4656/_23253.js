//00:25:34
function solution(data) {
  let input = data.toString().trim().split('\n');
  const [N, M] = input[0].split(' ').map(Number);
  let answer = 'Yes';

  for (let i = 1; i <= M; i++) {
    let arr = input[2 * i].split(' ').map(Number);
    for (let j = 0; j < arr.length - 1; j++) {
      if (arr[j] < arr[j + 1]) {
        answer = 'No';
      }
    }
  }
  return answer;
}

const case1 = `4 2
2
3 1
2
4 2`;
const case2 = `5 2
3
3 5 1
2
4 2`;

console.log(solution(case1));
console.log(solution(case2));
